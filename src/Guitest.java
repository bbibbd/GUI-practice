import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Guitest extends JFrame implements ActionListener{
	JButton btnA = new JButton("전체");
	JButton btnM = new JButton("남자");
	JButton btnF = new JButton("여자");
	JTextArea txtResult = new JTextArea();
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public Guitest() {
		setTitle("고객 출력");
		
		layInit();	//레이아웃 메소드
		accDb();	//db접근메소드
		
		setBounds(200, 200, 300, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//레이아웃
	private void layInit() {
		JPanel panel = new JPanel();		// Flowlayout
		panel.add(btnA); panel.add(btnM); panel.add(btnF);
		txtResult.setEditable(false);			// read only
		JScrollPane pane = new JScrollPane(txtResult);           // ScrollBar 추가
		
		add("Center", pane);
		add("North", panel);
		
		btnA.addActionListener(this);
		btnM.addActionListener(this);
		btnF.addActionListener(this);
	}
	
	//Database Driver 로딩
	private void accDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("오류 : " + e);
		}
	}
	
	//각 버튼에 대한 실행 내용
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			//Driver 연결
			conn = DriverManager.getConnection("jdbc:mysql://104.155.151.3/test");
			
			//열기
			stmt = conn.createStatement();
			String sql = "select ID, Namge, Gender from STUDENTINFO";
			
			if(e.getSource() == btnA) {
			} else if(e.getSource() == btnM) {	//남자일경우
				sql += " where Gender like 'M'";
				//sql += " where substr(gogek_jumin,8,1)=1";	
			} else if(e.getSource() == btnF) {	//여자일경우
				sql += " where Gender like 'F'";
			}
			
			//읽기
			rs = stmt.executeQuery(sql);
			int count = 0; //전체 데이터 수를 체크하기 위한 변수
			txtResult.setText("ID\tName\tGender\n");
			while(rs.next()) {
				//System.out.println(rs.getString(2));
				//읽은 내용을 TextArea에 뿌리기
				String str = rs.getInt("ID") + "\t" + rs.getString("Name") + "\t" + rs.getString("Gender") + "\n";  
				txtResult.append(str);
				count++;
			}
			txtResult.append("인원수 : " + count);
			
		} catch (Exception e2) {
			System.out.println("actionPerformed err : " + e);
		} finally {						
			// 닫기
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		new Guitest();
	}
}

