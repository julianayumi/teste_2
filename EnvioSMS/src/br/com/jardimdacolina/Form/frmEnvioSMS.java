package br.com.jardimdacolina.Form;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import br.com.epica.ServerInfo.ServerInfo;
import br.com.epica.ws.EnviaSMSModel;
import br.com.epica.ws.EpicaWebServiceInterface;
import br.com.jardimdacolina.Class.Chamadas;

public class frmEnvioSMS{
//	public class frmEnvioSMS extends Dialog {

	protected Object result;
	protected Shell shlEnvioDeSms;
	
	
	public static String sURL = new ServerInfo().getIpAddress();
	private Text txtQtdeDia;
	private Text txtQtdeSel;
	
	
	
	public static void main(String[] args) {
		try {
			frmEnvioSMS window = new frmEnvioSMS();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 *
	public frmEnvioSMS(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}
	
	*/

	/**
	 * Open the dialog.
	 * @return the result
	
	public Object open() {
		createContents();
		shlEnvioDeSms.open();
		shlEnvioDeSms.layout();
		Display display = getParent().getDisplay();
		while (!shlEnvioDeSms.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}	
	 */	
	
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlEnvioDeSms.open();
		shlEnvioDeSms.layout();
		while (!shlEnvioDeSms.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shlEnvioDeSms = new Shell();
		//shlEnvioDeSms = new Shell(getParent(), getStyle());
		shlEnvioDeSms.setSize(1008, 823);
		shlEnvioDeSms.setText("Envio de SMS");
		
		org.eclipse.swt.widgets.List lista = new org.eclipse.swt.widgets.List(shlEnvioDeSms, SWT.BORDER);
		lista.setBounds(6, 42, 977, 654);		
		
		
		Button btnNewButton = new Button(shlEnvioDeSms, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {

				try {

					String destinatario, vencto, historico;

					int dias_vencto =  Integer.parseInt(txtQtdeDia.getText());
					
					List<EnviaSMSModel> smsLista = retornaSMS(dias_vencto, "S");
					
					txtQtdeSel.setText( Integer.toString(smsLista.size()));

					String usuario = retornaParam("usuarioSMS");
					String senha = retornaParam("senhaSMS");

					for (int i = 0; i < smsLista.size(); i++) {

						if ((!smsLista.get(i).getNumeroFone().isEmpty())
								|| (!smsLista.get(i).getNumeroFone().equals("NA"))) {

							destinatario = smsLista.get(i).getNumeroFone();
							vencto = smsLista.get(i).getDataVencto();

							Chamadas.simpleTaxa(usuario, senha, destinatario, vencto);

							historico = "ENVIO DE SMS PARA ALERTA DE " + Integer.toString(dias_vencto)
									+ " DIA(S) PARA VENCIMENTO";

							String gravou = gravaLogSMS(smsLista.get(i).getProposta(), 17, 12, historico);

							if (gravou == "true") {
								lista.add("LOG GRAVADO COM SUCESO <===>" + smsLista.get(i).getProposta() + "  <===>  "
										+ smsLista.get(i).getDataVencto() + "  <===>  " + historico);
							} else {

								lista.add("LOG NÃO FOI GRAVADO <===>" + smsLista.get(i).getProposta()    + "  <===>  "
										+ smsLista.get(i).getDataVencto() + "  <===>  " + historico);
							}
						}
					}

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
		});	
		
		
		btnNewButton.setBounds(26, 713, 179, 57);
		btnNewButton.setText("&Enviar");

		Label lblLogDeExecuo = new Label(shlEnvioDeSms, SWT.NONE);
		lblLogDeExecuo.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		lblLogDeExecuo.setBounds(10, 10, 218, 28);
		lblLogDeExecuo.setText("Log de Execu\u00E7\u00E3o");

		txtQtdeDia = new Text(shlEnvioDeSms, SWT.BORDER | SWT.CENTER);
		txtQtdeDia.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		txtQtdeDia.setText("5");
		txtQtdeDia.setBounds(672, 739, 78, 31);

		Label lblNewLabel = new Label(shlEnvioDeSms, SWT.NONE);
		lblNewLabel.setBounds(672, 713, 70, 20);
		lblNewLabel.setText("Qtde. Dias");			
		
		Button btnSair = new Button(shlEnvioDeSms, SWT.NONE);
		btnSair.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				int selectOption;

				String[] opcoes = { "Sim", "Não" };
				selectOption = JOptionPane.showOptionDialog(null, "Deseja realmente sair do sistema ? ", "Sair!",
						JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, opcoes, opcoes[0]);

				if (selectOption == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
			
		});
		btnSair.setBounds(210, 713, 179, 57);
		btnSair.setText("&Sair");
		

		Group grpOpcao = new Group(shlEnvioDeSms, SWT.BORDER | SWT.SHADOW_NONE);
		grpOpcao.setBounds(775, 721, 208, 49);

		Button rbAlerta = new Button(grpOpcao, SWT.RADIO);
		rbAlerta.setSelection(true);
		rbAlerta.setBounds(10, 19, 70, 20);
		rbAlerta.setText("Alerta");

		Button rbCobranca = new Button(grpOpcao, SWT.RADIO);
		rbCobranca.setBounds(105, 19, 93, 20);
		rbCobranca.setText("Cobran\u00E7a");
		
		txtQtdeSel = new Text(shlEnvioDeSms, SWT.BORDER | SWT.CENTER);
		txtQtdeSel.setText("0");
		txtQtdeSel.setBounds(566, 739, 78, 26);
		
		Label lblTotSelecionado = new Label(shlEnvioDeSms, SWT.NONE);
		lblTotSelecionado.setBounds(566, 713, 70, 20);
		lblTotSelecionado.setText("Tot. Sel.");

	}
	
	
	
	private static List<EnviaSMSModel> retornaSMS(int dias, String tipo) {

		URL url;
        
		try {
        
			url = new URL(sURL);
        
			QName qname = new QName("http://WS.epica.com.br/", "EpicaWebServiceService");
			Service ws = Service.create(url, qname);
			EpicaWebServiceInterface retorno = ws.getPort(EpicaWebServiceInterface.class);
			return retorno.retornaSMS(dias, tipo);
        
		} catch (MalformedURLException e) {
			e.printStackTrace();
         
		}
        
		return null;
	}

	private static String gravaLogSMS(String proposta, int operador, int motivo, String historico) {

		URL url;

		try {

			String ret;
			url = new URL(sURL);

			QName qname = new QName("http://WS.epica.com.br/", "EpicaWebServiceService");
			Service ws = Service.create(url, qname);
			EpicaWebServiceInterface retorno = ws.getPort(EpicaWebServiceInterface.class);

			ret = retorno.gravaLogSMS(proposta, operador, motivo, historico);
			return ret;

		} catch (MalformedURLException e) {
			e.printStackTrace();

		}

		return null;

	}

	private static String retornaParam(String tipoParam) {

		URL url;

		try {

			String ret;
			url = new URL(sURL);

			QName qname = new QName("http://WS.epica.com.br/", "EpicaWebServiceService");
			Service ws = Service.create(url, qname);

			EpicaWebServiceInterface retorno = ws.getPort(EpicaWebServiceInterface.class);

			ret = retorno.retornaParam(tipoParam);

			return ret;

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}
}











