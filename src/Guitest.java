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
	JButton btnA = new JButton("��ü");
	JButton btnM = new JButton("����");
	JButton btnF = new JButton("����");
	JTextArea txtResult = new JTextArea();
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public Guitest() {
		setTitle("�� ���");
		
		layInit();	//���̾ƿ� �޼ҵ�
		accDb();	//db���ٸ޼ҵ�
		
		setBounds(200, 200, 300, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//���̾ƿ�
	private void layInit() {
		JPanel panel = new JPanel();		// Flowlayout
		panel.add(btnA); panel.add(btnM); panel.add(btnF);
		txtResult.setEditable(false);			// read only
		JScrollPane pane = new JScrollPane(txtResult);           // ScrollBar �߰�
		
		add("Center", pane);
		add("North", panel);
		
		btnA.addActionListener(this);
		btnM.addActionListener(this);
		btnF.addActionListener(this);
	}
	
	//Database Driver �ε�
	private void accDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("���� : " + e);
		}
	}
	
	//�� ��ư�� ���� ���� ����
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			//Driver ����
			conn = DriverManager.getConnection("jdbc:mysql://104.155.151.3/test");
			
			//����
			stmt = conn.createStatement();
			String sql = "select ID, Namge, Gender from STUDENTINFO";
			
			if(e.getSource() == btnA) {
			} else if(e.getSource() == btnM) {	//�����ϰ��
				sql += " where Gender like 'M'";
				//sql += " where substr(gogek_jumin,8,1)=1";	
			} else if(e.getSource() == btnF) {	//�����ϰ��
				sql += " where Gender like 'F'";
			}
			
			//�б�
			rs = stmt.executeQuery(sql);
			int count = 0; //��ü ������ ���� üũ�ϱ� ���� ����
			txtResult.setText("ID\tName\tGender\n");
			while(rs.next()) {
				//System.out.println(rs.getString(2));
				//���� ������ TextArea�� �Ѹ���
				String str = rs.getInt("ID") + "\t" + rs.getString("Name") + "\t" + rs.getString("Gender") + "\n";  
				txtResult.append(str);
				count++;
			}
			txtResult.append("�ο��� : " + count);
			
		} catch (Exception e2) {
			System.out.println("actionPerformed err : " + e);
		} finally {						
			// �ݱ�
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

