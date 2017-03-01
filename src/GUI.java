package program;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField_initialAC;
	private JTextField textField_initialDR;
	private JTextField textField_initialPC;
	private JTextField textField_initialAR;
	private JTextField textField_initialMAR;
	private JTextField textField_initialIR;
	private JTextField textField_initialE;
	private JTextField textField_t0_AC;
	private JTextField textField_t0_DR;
	private JTextField textField_t0_PC;
	private JTextField textField_t0_AR;
	private JTextField textField_t0_MAR;
	private JTextField textField_12;
	private JTextField textField_t0_E;
	private JTextField textField_t1_AC;
	private JTextField textField_t1_DR;
	private JTextField textField_t1_PC;
	private JTextField textField_t1_AR;
	private JTextField textField_18;
	private JTextField textField_t1_IR;
	private JTextField textField_20;
	private JTextField textField_t2_AC;
	private JTextField textField_t2_DR;
	private JTextField textField_t2_PC;
	private JTextField textField_t2_AR;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_t3_AC;
	private JTextField textField_t3_DR;
	private JTextField textField_t3_PC;
	private JTextField textField_t3_AR;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_t4_AC;
	private JTextField textField_t4_DR;
	private JTextField textField_t4_PC;
	private JTextField textField_t4_AR;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_t5_AC;
	private JTextField textField_t5_DR;
	private JTextField textField_t5_PC;
	private JTextField textField_t5_AR;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_afterAC;
	private JTextField textField_afterDR;
	private JTextField textField_afterPC;
	private JTextField textField_afterAR;
	private JTextField textField_afterMAR;
	private JTextField textField_afterIR;
	private JTextField textField_afterE;
	private int memory[][];
	private String ACVal;
	private String DRVal;
	private String PCVal;
	private String ARVal;
	private String MARVal;
	private String IRVal;
	private int EVal;

	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		memory = new int[4096][4];
		
		textField_initialAC = new JTextField();
		textField_initialAC.setText("1111");
		textField_initialAC.setBounds(110, 42, 71, 22);
		contentPane.add(textField_initialAC);
		textField_initialAC.setColumns(10);
		
		JLabel lblAc = new JLabel("AC");
		lblAc.setBounds(136, 13, 31, 16);
		contentPane.add(lblAc);
		
		JLabel lblDr = new JLabel("DR");
		lblDr.setBounds(219, 13, 36, 16);
		contentPane.add(lblDr);
		
		JLabel lblPc = new JLabel("PC");
		lblPc.setBounds(299, 13, 31, 16);
		contentPane.add(lblPc);
		
		JLabel lblAr = new JLabel("AR");
		lblAr.setBounds(383, 13, 36, 16);
		contentPane.add(lblAr);
		
		JLabel lblMar = new JLabel("M[AR]");
		lblMar.setBounds(456, 13, 46, 16);
		contentPane.add(lblMar);
		
		JLabel lblIr = new JLabel("IR");
		lblIr.setBounds(552, 13, 36, 16);
		contentPane.add(lblIr);
		
		JLabel lblE = new JLabel("E");
		lblE.setBounds(640, 13, 20, 16);
		contentPane.add(lblE);
		
		textField_initialDR = new JTextField();
		textField_initialDR.setText("1111");
		textField_initialDR.setColumns(10);
		textField_initialDR.setBounds(193, 42, 71, 22);
		contentPane.add(textField_initialDR);
		
		textField_initialPC = new JTextField();
		textField_initialPC.setEditable(false);
		textField_initialPC.setColumns(10);
		textField_initialPC.setBounds(276, 42, 71, 22);
		contentPane.add(textField_initialPC);
		
		textField_initialAR = new JTextField();
		textField_initialAR.setText("035");
		textField_initialAR.setColumns(10);
		textField_initialAR.setBounds(359, 42, 71, 22);
		contentPane.add(textField_initialAR);
		
		textField_initialMAR = new JTextField();
		textField_initialMAR.setText("7040");
		textField_initialMAR.setColumns(10);
		textField_initialMAR.setBounds(442, 42, 71, 22);
		contentPane.add(textField_initialMAR);
		
		textField_initialIR = new JTextField();
		textField_initialIR.setText("4401");
		textField_initialIR.setColumns(10);
		textField_initialIR.setBounds(525, 42, 71, 22);
		contentPane.add(textField_initialIR);
		
		textField_initialE = new JTextField();
		textField_initialE.setText("1");
		textField_initialE.setColumns(10);
		textField_initialE.setBounds(608, 42, 71, 22);
		contentPane.add(textField_initialE);
		
		textField_t0_AC = new JTextField();
		textField_t0_AC.setEditable(false);
		textField_t0_AC.setColumns(10);
		textField_t0_AC.setBounds(110, 109, 71, 22);
		contentPane.add(textField_t0_AC);
		
		textField_t0_DR = new JTextField();
		textField_t0_DR.setEditable(false);
		textField_t0_DR.setColumns(10);
		textField_t0_DR.setBounds(193, 109, 71, 22);
		contentPane.add(textField_t0_DR);
		
		textField_t0_PC = new JTextField();
		textField_t0_PC.setEditable(false);
		textField_t0_PC.setColumns(10);
		textField_t0_PC.setBounds(276, 109, 71, 22);
		contentPane.add(textField_t0_PC);
		
		textField_t0_AR = new JTextField();
		textField_t0_AR.setEditable(false);
		textField_t0_AR.setColumns(10);
		textField_t0_AR.setBounds(359, 109, 71, 22);
		contentPane.add(textField_t0_AR);
		
		textField_t0_MAR = new JTextField();
		textField_t0_MAR.setEditable(false);
		textField_t0_MAR.setColumns(10);
		textField_t0_MAR.setBounds(442, 109, 71, 22);
		contentPane.add(textField_t0_MAR);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(525, 109, 71, 22);
		contentPane.add(textField_12);
		
		textField_t0_E = new JTextField();
		textField_t0_E.setEditable(false);
		textField_t0_E.setColumns(10);
		textField_t0_E.setBounds(608, 109, 71, 22);
		contentPane.add(textField_t0_E);
		
		textField_t1_AC = new JTextField();
		textField_t1_AC.setEditable(false);
		textField_t1_AC.setColumns(10);
		textField_t1_AC.setBounds(110, 144, 71, 22);
		contentPane.add(textField_t1_AC);
		
		textField_t1_DR = new JTextField();
		textField_t1_DR.setEditable(false);
		textField_t1_DR.setColumns(10);
		textField_t1_DR.setBounds(193, 144, 71, 22);
		contentPane.add(textField_t1_DR);
		
		textField_t1_PC = new JTextField();
		textField_t1_PC.setEditable(false);
		textField_t1_PC.setColumns(10);
		textField_t1_PC.setBounds(276, 144, 71, 22);
		contentPane.add(textField_t1_PC);
		
		textField_t1_AR = new JTextField();
		textField_t1_AR.setEditable(false);
		textField_t1_AR.setColumns(10);
		textField_t1_AR.setBounds(359, 144, 71, 22);
		contentPane.add(textField_t1_AR);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(442, 144, 71, 22);
		contentPane.add(textField_18);
		
		textField_t1_IR = new JTextField();
		textField_t1_IR.setEditable(false);
		textField_t1_IR.setColumns(10);
		textField_t1_IR.setBounds(525, 144, 71, 22);
		contentPane.add(textField_t1_IR);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(608, 144, 71, 22);
		contentPane.add(textField_20);
		
		textField_t2_AC = new JTextField();
		textField_t2_AC.setEditable(false);
		textField_t2_AC.setColumns(10);
		textField_t2_AC.setBounds(110, 179, 71, 22);
		contentPane.add(textField_t2_AC);
		
		textField_t2_DR = new JTextField();
		textField_t2_DR.setEditable(false);
		textField_t2_DR.setColumns(10);
		textField_t2_DR.setBounds(193, 179, 71, 22);
		contentPane.add(textField_t2_DR);
		
		textField_t2_PC = new JTextField();
		textField_t2_PC.setEditable(false);
		textField_t2_PC.setColumns(10);
		textField_t2_PC.setBounds(276, 179, 71, 22);
		contentPane.add(textField_t2_PC);
		
		textField_t2_AR = new JTextField();
		textField_t2_AR.setEditable(false);
		textField_t2_AR.setColumns(10);
		textField_t2_AR.setBounds(359, 179, 71, 22);
		contentPane.add(textField_t2_AR);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(442, 179, 71, 22);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBounds(525, 179, 71, 22);
		contentPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(608, 179, 71, 22);
		contentPane.add(textField_27);
		
		textField_t3_AC = new JTextField();
		textField_t3_AC.setEditable(false);
		textField_t3_AC.setColumns(10);
		textField_t3_AC.setBounds(110, 214, 71, 22);
		contentPane.add(textField_t3_AC);
		
		textField_t3_DR = new JTextField();
		textField_t3_DR.setEditable(false);
		textField_t3_DR.setColumns(10);
		textField_t3_DR.setBounds(193, 214, 71, 22);
		contentPane.add(textField_t3_DR);
		
		textField_t3_PC = new JTextField();
		textField_t3_PC.setEditable(false);
		textField_t3_PC.setColumns(10);
		textField_t3_PC.setBounds(276, 214, 71, 22);
		contentPane.add(textField_t3_PC);
		
		textField_t3_AR = new JTextField();
		textField_t3_AR.setEditable(false);
		textField_t3_AR.setColumns(10);
		textField_t3_AR.setBounds(359, 214, 71, 22);
		contentPane.add(textField_t3_AR);
		
		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBounds(442, 214, 71, 22);
		contentPane.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBounds(525, 214, 71, 22);
		contentPane.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBounds(608, 214, 71, 22);
		contentPane.add(textField_34);
		
		textField_t4_AC = new JTextField();
		textField_t4_AC.setEditable(false);
		textField_t4_AC.setColumns(10);
		textField_t4_AC.setBounds(110, 249, 71, 22);
		contentPane.add(textField_t4_AC);
		
		textField_t4_DR = new JTextField();
		textField_t4_DR.setEditable(false);
		textField_t4_DR.setColumns(10);
		textField_t4_DR.setBounds(193, 249, 71, 22);
		contentPane.add(textField_t4_DR);
		
		textField_t4_PC = new JTextField();
		textField_t4_PC.setEditable(false);
		textField_t4_PC.setColumns(10);
		textField_t4_PC.setBounds(276, 249, 71, 22);
		contentPane.add(textField_t4_PC);
		
		textField_t4_AR = new JTextField();
		textField_t4_AR.setEditable(false);
		textField_t4_AR.setColumns(10);
		textField_t4_AR.setBounds(359, 249, 71, 22);
		contentPane.add(textField_t4_AR);
		
		textField_39 = new JTextField();
		textField_39.setEditable(false);
		textField_39.setColumns(10);
		textField_39.setBounds(442, 249, 71, 22);
		contentPane.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setEditable(false);
		textField_40.setColumns(10);
		textField_40.setBounds(525, 249, 71, 22);
		contentPane.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setEditable(false);
		textField_41.setColumns(10);
		textField_41.setBounds(608, 249, 71, 22);
		contentPane.add(textField_41);
		
		textField_t5_AC = new JTextField();
		textField_t5_AC.setEditable(false);
		textField_t5_AC.setColumns(10);
		textField_t5_AC.setBounds(110, 284, 71, 22);
		contentPane.add(textField_t5_AC);
		
		textField_t5_DR = new JTextField();
		textField_t5_DR.setEditable(false);
		textField_t5_DR.setColumns(10);
		textField_t5_DR.setBounds(193, 284, 71, 22);
		contentPane.add(textField_t5_DR);
		
		textField_t5_PC = new JTextField();
		textField_t5_PC.setEditable(false);
		textField_t5_PC.setColumns(10);
		textField_t5_PC.setBounds(276, 284, 71, 22);
		contentPane.add(textField_t5_PC);
		
		textField_t5_AR = new JTextField();
		textField_t5_AR.setEditable(false);
		textField_t5_AR.setColumns(10);
		textField_t5_AR.setBounds(359, 284, 71, 22);
		contentPane.add(textField_t5_AR);
		
		textField_46 = new JTextField();
		textField_46.setEditable(false);
		textField_46.setColumns(10);
		textField_46.setBounds(442, 284, 71, 22);
		contentPane.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setEditable(false);
		textField_47.setColumns(10);
		textField_47.setBounds(525, 284, 71, 22);
		contentPane.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setEditable(false);
		textField_48.setColumns(10);
		textField_48.setBounds(608, 284, 71, 22);
		contentPane.add(textField_48);
		
		textField_afterAC = new JTextField();
		textField_afterAC.setEditable(false);
		textField_afterAC.setColumns(10);
		textField_afterAC.setBounds(110, 319, 71, 22);
		contentPane.add(textField_afterAC);
		
		textField_afterDR = new JTextField();
		textField_afterDR.setEditable(false);
		textField_afterDR.setColumns(10);
		textField_afterDR.setBounds(193, 319, 71, 22);
		contentPane.add(textField_afterDR);
		
		textField_afterPC = new JTextField();
		textField_afterPC.setEditable(false);
		textField_afterPC.setColumns(10);
		textField_afterPC.setBounds(276, 319, 71, 22);
		contentPane.add(textField_afterPC);
		
		textField_afterAR = new JTextField();
		textField_afterAR.setEditable(false);
		textField_afterAR.setColumns(10);
		textField_afterAR.setBounds(359, 319, 71, 22);
		contentPane.add(textField_afterAR);
		
		textField_afterMAR = new JTextField();
		textField_afterMAR.setEditable(false);
		textField_afterMAR.setColumns(10);
		textField_afterMAR.setBounds(442, 319, 71, 22);
		contentPane.add(textField_afterMAR);
		
		textField_afterIR = new JTextField();
		textField_afterIR.setEditable(false);
		textField_afterIR.setColumns(10);
		textField_afterIR.setBounds(525, 319, 71, 22);
		contentPane.add(textField_afterIR);
		
		textField_afterE = new JTextField();
		textField_afterE.setEditable(false);
		textField_afterE.setColumns(10);
		textField_afterE.setBounds(608, 319, 71, 22);
		contentPane.add(textField_afterE);
		
		//Listen to button press
		JButton btnProcess = new JButton("Process");
		btnProcess.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) //Handle click
			{
				int memoryLocation = Integer.parseInt(textField_initialPC.getText());
				StringBuilder sb = processHex(memoryLocation);
				
				//Get input from textfields
				ACVal = textField_initialAC.getText();
				DRVal = textField_initialDR.getText();
				ARVal = textField_initialAR.getText();
				MARVal = textField_initialMAR.getText();
				IRVal = textField_initialIR.getText();
				EVal = Integer.parseInt(textField_initialE.getText());
				
				//First steps (t0)
				textField_t0_AC.setText(ACVal);
				textField_t0_DR.setText(DRVal);
				textField_t0_PC.setText(PCVal);
				textField_t0_E.setText(Integer.toString(EVal));
				
				ARVal = PCVal; //Assign PC to AR
				textField_t0_AR.setText(ARVal);
				textField_t0_MAR.setText(sb.toString()); //Set M[AR] to the value of AR
				
				//Increment PC by 1
				int pcVal = Integer.parseInt(textField_initialPC.getText()); pcVal++;
				textField_t1_PC.setText(Integer.toString(pcVal));
				textField_afterPC.setText(Integer.toString(pcVal));
				PCVal = Integer.toString(pcVal);
				//
				
				//Set IR to M[AR]
	//			textField_t1_IR.setText(textField_t0_MAR.getText());
				textField_t1_IR.setText(Integer.toString(7080)); //HARDCODED FOR TESTING
				//
				
				//Set AR to the last 3 bits of AR
				textField_t2_AR.setText(sb.substring(1));
				//
				
				//set E value
				EVal = Integer.parseInt(textField_initialE.getText());
				//
				
				//Process instruction
				if(textField_t1_IR.getText().startsWith("7"))
				{
					processRegisterInstruction(Integer.parseInt(textField_t1_IR.getText()));
				}
								
				switch (textField_t1_IR.getText().charAt(0))
				{
				case '0': processMemoryInstruction(0); break;
				case '1': processMemoryInstruction(1); break;
				case '2': processMemoryInstruction(2); break;
				case '3': processMemoryInstruction(3); break;
				case '4': processMemoryInstruction(4); break;
				case '5': processMemoryInstruction(5); break;
				case '6': processMemoryInstruction(6); break;
				case '8': processMemoryInstruction(8); break;
				case '9': processMemoryInstruction(9); break;
				case 'A': processMemoryInstruction(10); break;
				case 'B': processMemoryInstruction(11); break;
				case 'C': processMemoryInstruction(12); break;
				case 'D': processMemoryInstruction(13); break;
				case 'E': processMemoryInstruction(14); break;
				case 'F': processMemoryInstruction(15); break;
				default: break;
				}
				//
				
				//Update all fields after instructions are executed
				textField_afterAC.setText(ACVal);
				textField_afterE.setText(Integer.toString(EVal));
				//
			}
		});
		btnProcess.setBounds(322, 71, 97, 25);
		contentPane.add(btnProcess);
		
		//Next instruction button handling
		JButton btnNext = new JButton("Next Instruction");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int memoryLocation = Integer.parseInt(PCVal);
				StringBuilder sb = processHex(memoryLocation);
				
				//First steps (t0)
				textField_t0_AC.setText(ACVal);
				textField_t0_DR.setText(DRVal);
				textField_t0_PC.setText(PCVal);
				textField_t0_E.setText(Integer.toString(EVal));
				
				ARVal = PCVal; //Assign PC to AR
				textField_t0_AR.setText(ARVal);
				textField_t0_MAR.setText(sb.toString()); //Set M[AR] to the value of AR
				
				//Increment PC by 1
				int pcVal = Integer.parseInt(PCVal); pcVal++;
				textField_t1_PC.setText(Integer.toString(pcVal));
				textField_afterPC.setText(Integer.toString(pcVal));
				PCVal = Integer.toString(pcVal);
				//
				
				//Set IR to M[AR]
				textField_t1_IR.setText(textField_t0_MAR.getText());
				//
				
				//Set AR to the last 3 bits of AR
				textField_t2_AR.setText(sb.substring(1));
				//
				
				//set E value
				EVal = Integer.parseInt(textField_initialE.getText());
				//
				
				//Process instruction
				if(textField_t1_IR.getText().startsWith("7"))
				{
					processRegisterInstruction(Integer.parseInt(textField_t1_IR.getText()));
				}
								
				switch (textField_t1_IR.getText().charAt(0))
				{
				case '0': processMemoryInstruction(0); break;
				case '1': processMemoryInstruction(1); break;
				case '2': processMemoryInstruction(2); break;
				case '3': processMemoryInstruction(3); break;
				case '4': processMemoryInstruction(4); break;
				case '5': processMemoryInstruction(5); break;
				case '6': processMemoryInstruction(6); break;
				case '8': processMemoryInstruction(8); break;
				case '9': processMemoryInstruction(9); break;
				case 'A': processMemoryInstruction(10); break;
				case 'B': processMemoryInstruction(11); break;
				case 'C': processMemoryInstruction(12); break;
				case 'D': processMemoryInstruction(13); break;
				case 'E': processMemoryInstruction(14); break;
				case 'F': processMemoryInstruction(15); break;
				default: break;
				}
				//

				//Update all fields after instructions are executed
				textField_afterAC.setText(ACVal);
				textField_afterE.setText(Integer.toString(EVal));
			}
		});
		btnNext.setBounds(314, 354, 131, 25);
		contentPane.add(btnNext);
		
		JLabel lblInitial = new JLabel("Initial");
		lblInitial.setBounds(42, 45, 56, 16);
		contentPane.add(lblInitial);
		
		JLabel lblT = new JLabel("T0");
		lblT.setBounds(42, 112, 56, 16);
		contentPane.add(lblT);
		
		JLabel lblT_1 = new JLabel("T1");
		lblT_1.setBounds(42, 147, 56, 16);
		contentPane.add(lblT_1);
		
		JLabel lblT_2 = new JLabel("T2");
		lblT_2.setBounds(42, 182, 56, 16);
		contentPane.add(lblT_2);
		
		JLabel lblT_3 = new JLabel("T3");
		lblT_3.setBounds(42, 217, 56, 16);
		contentPane.add(lblT_3);
		
		JLabel lblT_4 = new JLabel("T4");
		lblT_4.setBounds(42, 252, 56, 16);
		contentPane.add(lblT_4);
		
		
		JLabel lblT_5 = new JLabel("T5");
		lblT_5.setBounds(42, 287, 56, 16);
		contentPane.add(lblT_5);
		
		JLabel lblT_6 = new JLabel("After");
		lblT_6.setBounds(42, 322, 56, 16);
		contentPane.add(lblT_6);

		
				
				
		setVisible(true);
	}
	
	public void setACVal(String ac)
	{
		ACVal = ac;
	}
	
	public void setDRVal(String dr)
	{
		DRVal = dr;
	}
	
	public void setPCVal(int pc)
	{
		textField_initialPC.setText(Integer.toString(pc));
		PCVal = Integer.toString(pc);
	}
	
	public void setARVal(String ar)
	{
		ARVal = ar;
	}
	
	public void setMARVal(String mar)
	{
		MARVal = mar;
	}
	
	public void setIRVal(String ir)
	{
		IRVal = ir;
	}
	
	public void setEVal(int e)
	{
		EVal = e;
	}
	
	public void setMemory(int memory[][])
	{
		this.memory = memory;
	}

	public StringBuilder processHex(int numToConvert)
	{
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 4; i++)
		{
			if (memory[numToConvert][i] == 10)
			{
				sb.append("A");
			}
			else if (memory[numToConvert][i] == 11)
			{
				sb.append("B");
			}
			else if (memory[numToConvert][i] == 12)
			{
				sb.append("C");
			}
			else if (memory[numToConvert][i] == 13)
			{
				sb.append("D");
			}
			else if (memory[numToConvert][i] == 14)
			{
				sb.append("E");
			}
			else if (memory[numToConvert][i] == 15)
			{
				sb.append("F");
			}
			else
				sb.append(Integer.toString(memory[numToConvert][i]));
		}
		
		return sb;
	}
	
	public void processRegisterInstruction(int val)
	{
		if (val == 7800)
		{
			//Clear AC
			textField_afterAC.setText("Cleared");
			//
		}
		
		else if (val == 7400)
		{
			//Clear E
			EVal = 0;
			//
		}
		else if (val == 7200)
		{
			//Complement AC
			//
		}
		else if (val == 7100)
		{
			//Complement E
			if (EVal == 0)
				EVal = 1;
			else
				EVal = 0;
			//
		}
		else if (val == 7080)
		{
			//Circulate right AC and E
			int c[] = new int[16];
			c = convert(ACVal); //Store 16bit AC value in this char array
			EVal = c[15]; //Put the rightmost bit of AC into E

			for (int i = 0; i < c.length; i++)
			{
				if (c[i] == 1)
				{
					c[i] = 0;
					if (i < 15)
						c[i+1] = 1;
					i++;
				}
				
			}
			//
			
			//Convert the values back to hexadecimal
			c[0] = EVal; //Put E value in the leftmost bit of AC
			String s = new String(Arrays.toString(c).replaceAll("\\[|\\]|,|\\s",  ""));
			System.out.println(s);
			
			int decimal = Integer.parseInt(s, 2);
			String hexStr = Integer.toString(decimal, 16);
			System.out.println(hexStr);
			ACVal = hexStr;
			
		}
		else if (val == 7040)
		{
			//Circulate left
			int c[] = new int[16];
			c = convert(ACVal); //Store 16bit AC value in this char array
			EVal = c[0]; //Put the leftmost bit of AC into E

			for (int i = 0; i < c.length; i++)
			{
				if (c[i] == 1)
				{
					c[i] = 0;
					if (i < 15)
						c[i-1] = 1;
					i++;
				}
				
			}
			//
			
			//Convert the values back to hexadecimal
			c[15] = EVal; //Put E value in the rightmost bit of AC
			String s = new String(Arrays.toString(c).replaceAll("\\[|\\]|,|\\s",  ""));
			System.out.println(s);
			
			int decimal = Integer.parseInt(s, 2);
			String hexStr = Integer.toString(decimal, 16);
			System.out.println(hexStr);
			ACVal = hexStr;
			
		}
		else if (val == 7020)
		{
			//Increment AC
			//
		}
		else if (val == 7010)
		{
			//Skip next instruction if AC positive
			//
		}
		else if (val == 7008)
		{
			//Skip next instruction if AC negative
			//
		}
		else if (val == 7004)
		{
			//Skip next instruction if AC is zero
			//
		}
		else if (val == 7002)
		{
			//Skip next instruction if E is 0
			//
		}
		else if (val == 7001)
		{
			//Halt
			//
		}
	}
	
	public void processMemoryInstruction(int val)
	{
		switch (val)
		{
		case 0: System.out.println("AND"); break;
		case 1: System.out.println("ADD"); break;
		case 2: System.out.println("LDA"); break;
		case 3: System.out.println("STA"); break;
		case 4: System.out.println("BUN"); break;
		case 5: System.out.println("BSA"); break;
		case 6: System.out.println("ISZ"); break;
		case 8: System.out.println("AND - INDIRECT ADDRESS"); break;
		case 9: System.out.println("ADD - INDIRECT ADDRESS"); break;
		case 10: System.out.println("LDA - INDIRECT ADDRESS"); break;
		case 11: System.out.println("STA - INDIRECT ADDRESS"); break;
		case 12: System.out.println("BUN - INDIRECT ADDRESS"); break;
		case 13: System.out.println("BSA - INDIRECT ADDRESS"); break;
		case 14: System.out.println("ISZ - INDIRECT ADDRESS"); break;
		case 15: System.out.println("DO NOTHING"); break;
		}
	}
	
	public int[] convert(String ac)
	{
		char c[] = ac.toCharArray();
		int c2[] = new int[16];
		int index = 0;
		
		int val;
		
		for (int i = 0; i < c.length; i++)
		{
			val = Character.getNumericValue(c[i]);
			
			switch (val)
			{
			case 0: c2[index++] = 0; c2[index++] = 0; c2[index++] = 0; c2[index++] = 0; break;
			case 1: c2[index++] = 0; c2[index++] = 0; c2[index++] = 0; c2[index++] = 1; break;
			case 2: c2[index++] = 0; c2[index++] = 0; c2[index++] = 1; c2[index++] = 0; break;
			case 3: c2[index++] = 0; c2[index++] = 0; c2[index++] = 1; c2[index++] = 1; break;
			case 4: c2[index++] = 0; c2[index++] = 1; c2[index++] = 0; c2[index++] = 0; break;
			case 5: c2[index++] = 0; c2[index++] = 1; c2[index++] = 0; c2[index++] = 1; break;
			case 6: c2[index++] = 0; c2[index++] = 1; c2[index++] = 1; c2[index++] = 0; break;
			case 7: c2[index++] = 0; c2[index++] = 1; c2[index++] = 1; c2[index++] = 1; break;
			case 8: c2[index++] = 1; c2[index++] = 0; c2[index++] = 0; c2[index++] = 0; break;
			case 9: c2[index++] = 1; c2[index++] = 0; c2[index++] = 0; c2[index++] = 1; break;
			case 10: c2[index++] = 1; c2[index++] = 0; c2[index++] = 1; c2[index++] = 0; break;
			case 11: c2[index++] = 1; c2[index++] = 0; c2[index++] = 1; c2[index++] = 1; break;
			case 12: c2[index++] = 1; c2[index++] = 1; c2[index++] = 0; c2[index++] = 0; break;
			case 13: c2[index++] = 1; c2[index++] = 1; c2[index++] = 0; c2[index++] = 1; break;
			case 14: c2[index++] = 1; c2[index++] = 1; c2[index++] = 1; c2[index++] = 0; break;
			case 15: c2[index++] = 1; c2[index++] = 1; c2[index++] = 1; c2[index++] = 1; break;
			default: break;
			}
		}

		return c2;
		
	}
}
