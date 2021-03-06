package Bettle.Screen.dataView;

import java.awt.BorderLayout;
import java.awt.Dialog.ModalExclusionType;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Bettle.model.data.ResultData;
import Bettle.model.data.ResultDataModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 * 결과 데이터 출력 프레임 클래스
 * @author Jeongsam
 *
 */
public class DataViewFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnExportFile;
	private JButton btnShowGraph;
	
	
	String columnNames[] = { "가로 크기", "세로 크기", "소요 시간", "딱정 벌레 수", "딜레이"};
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public DataViewFrame() {
		
		setType(Type.UTILITY);
		setTitle("\uB370\uC774\uD130 \uD14C\uC774\uBE14");
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 460, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnExportFile = new JButton("\uD30C\uC77C \uB0B4\uBCF4\uB0B4\uAE30");
		btnExportFile.setFont(new Font("굴림", Font.BOLD, 14));
		panel.add(btnExportFile);
		
		btnShowGraph = new JButton("\uADF8\uB798\uD504 \uBCF4\uAE30");
		btnShowGraph.setFont(new Font("굴림", Font.BOLD, 14));
		panel.add(btnShowGraph);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		table = new JTable();
		contentPane.add(table, BorderLayout.WEST);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		
	}
	
	public void setDataTable(ResultData data){
		
		
		int length = data.getData().length;
		
		Object rowData[][] = new Object[length][5];
		
		for(int i=0; i<length; i++){
			
			try{
				ResultDataModel modelData = data.getData()[i];
				Object objectData[] = {modelData.getWidth(), modelData.getHeight(), modelData.getTime(), modelData.getBeetleCount(), modelData.getDalay()};
				
				for(int j=0; j<5; j++)
					rowData[i][j] = objectData[j];
			}catch (Exception e){
				//ignore
			}
			
			
			
		}
		 
		
		DefaultTableModel defaultTableModel = new DefaultTableModel(rowData, columnNames);
		table.setModel(defaultTableModel);
		
	}

}
