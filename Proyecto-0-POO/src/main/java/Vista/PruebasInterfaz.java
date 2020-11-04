/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Aldokler
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PruebasInterfaz {
    
    private static void Window(){
        JFrame ventana = new JFrame("Rent a car A&B");
        ventana.setSize(1080,720); 
        ventana.setLayout(null); 
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //########---Submenus---#######
        JPanel MenuPrincipal = new JPanel();
        MenuPrincipal.setBounds(0, 0, 1080, 720);
        MenuPrincipal.setBackground(Color.getHSBColor(167, 34, 81));
        MenuPrincipal.setLayout(null);
        
        JPanel MenuRegistrarCliente = new JPanel();
        MenuRegistrarCliente.setBounds(0, 0, 1080, 720);
        MenuRegistrarCliente.setBackground(Color.getHSBColor(167, 34, 81));
        MenuRegistrarCliente.setLayout(null);
        
        JPanel MenuAgregarVehiculo = new JPanel();
        MenuAgregarVehiculo.setBounds(0, 0, 1080, 720);
        MenuAgregarVehiculo.setBackground(Color.getHSBColor(167, 34, 81));
        MenuAgregarVehiculo.setLayout(null);
        
        JPanel MenuRegistrarEmpresa = new JPanel();
        MenuRegistrarEmpresa.setBounds(0, 0, 1080, 720);
        MenuRegistrarEmpresa.setBackground(Color.getHSBColor(167, 34, 81));
        MenuRegistrarEmpresa.setLayout(null);
         
        JPanel MenuRegistrarMantenimiento = new JPanel();
        MenuRegistrarMantenimiento.setBounds(0, 0, 1080, 720);
        MenuRegistrarMantenimiento.setBackground(Color.getHSBColor(167, 34, 81));
        MenuRegistrarMantenimiento.setLayout(null);
        
        JPanel MenuEditarVehiculo = new JPanel();
        MenuEditarVehiculo.setBounds(0, 0, 1080, 720);
        MenuEditarVehiculo.setBackground(Color.getHSBColor(167, 34, 81));
        MenuEditarVehiculo.setLayout(null);
        
        JPanel MenuHacerReserva = new JPanel();
        MenuHacerReserva.setBounds(0, 0, 1080, 720);
        MenuHacerReserva.setBackground(Color.getHSBColor(167, 34, 81));
        MenuHacerReserva.setLayout(null);
        
        JPanel MenuConsultarReserva = new JPanel();
        MenuConsultarReserva.setBounds(0, 0, 1080, 720);
        MenuConsultarReserva.setBackground(Color.getHSBColor(167, 34, 81));
        MenuConsultarReserva.setLayout(null);
        
        JPanel MenuRegistrarAdmin = new JPanel();
        MenuRegistrarAdmin.setBounds(0, 0, 1080, 720);
        MenuRegistrarAdmin.setBackground(Color.getHSBColor(167, 34, 81));
        MenuRegistrarAdmin.setLayout(null);
        
        /*
         *  ###########---Componentes MenuPrincipal---#############
         */
        
        JButton botonRegistrarCliente = new JButton("Registrar cliente");
        botonRegistrarCliente.setBounds(20, 530, 245, 50);
        botonRegistrarCliente.addActionListener((ActionEvent e) -> {
            MenuPrincipal.setVisible(false);
            ventana.add(MenuRegistrarCliente);
            MenuRegistrarCliente.setVisible(true);
            ventana.remove(MenuPrincipal);
            
        });
        
        JButton botonAgregarVehiculo = new JButton("Agregar vehículo");
        botonAgregarVehiculo.setBounds(285, 530, 245, 50);
        
        JButton botonRegistrarEmpresa = new JButton("Registrar empresa");
        botonRegistrarEmpresa.setBounds(550, 530, 245, 50);
        
        JButton botonRegistrarMantenimiento = new JButton("Registrar mantenimiento");
        botonRegistrarMantenimiento.setBounds(815, 530, 245, 50);
        
        JButton botonEditarVehiculo = new JButton("Editar vehiculo");
        botonEditarVehiculo.setBounds(20, 600, 245, 50);
        
        JButton botonHacerReserva = new JButton("Hacer una reserva");
        botonHacerReserva.setBounds(285, 600, 245, 50);
        
        JButton botonConsultarReserva = new JButton("Consultar una reserva");
        botonConsultarReserva.setBounds(550, 600, 245, 50);
        
        JButton botonRegistrarAdmin = new JButton("Registrar usuario 'Servicio al cliente'");
        botonRegistrarAdmin.setBounds(815, 600, 245, 50);
        
        MenuPrincipal.add(botonRegistrarCliente);
        MenuPrincipal.add(botonAgregarVehiculo);
        MenuPrincipal.add(botonRegistrarEmpresa);
        MenuPrincipal.add(botonRegistrarMantenimiento);
        MenuPrincipal.add(botonEditarVehiculo);
        MenuPrincipal.add(botonHacerReserva);
        MenuPrincipal.add(botonConsultarReserva);
        MenuPrincipal.add(botonRegistrarAdmin);
        
        /*  
         *  ##############################################################
         *  ###########---Componentes MenuRegistrarCliente---#############
         *  ##############################################################
         */
        
        JPanel CuadroRegistrarCliente = new JPanel();
        CuadroRegistrarCliente.setBounds(200, 110, 500, 500);
        float[] celestico = Color.RGBtoHSB(107, 255, 208, null);
        CuadroRegistrarCliente.setBackground(Color.getHSBColor(celestico[0], celestico[1], celestico[2]));
        CuadroRegistrarCliente.setLayout(null);
        
        MenuRegistrarCliente.add(CuadroRegistrarCliente);
        
        JLabel TitleRegistrarCliente = new JLabel("Registrar Empleado");
        TitleRegistrarCliente.setBounds(190, 5, 500, 20);
        JButton VolverRegistrarCliente = new JButton("Volver");
        VolverRegistrarCliente.setBounds(5, 480, 100, 15);
        VolverRegistrarCliente.addActionListener((ActionEvent e) -> {
            MenuRegistrarCliente.setVisible(false);
            ventana.add(MenuPrincipal);
            MenuPrincipal.setVisible(true);
            ventana.remove(MenuRegistrarCliente);
        });
        JButton BotonRegistrarCliente = new JButton("Registrar");
        BotonRegistrarCliente.setBounds(395, 480, 100, 15);
        
        JLabel LabelClienteNombre = new JLabel("Nombre Completo");
        LabelClienteNombre.setBounds(5, 50, 400, 15);
        JTextField TextClienteNombre = new JTextField();
        TextClienteNombre.setBounds(150, 50, 330, 16);
        
        JLabel LabelClienteCedula = new JLabel("Cédula");
        LabelClienteCedula.setBounds(5, 70, 400, 15);
        JTextField TextClienteCedula = new JTextField();
        TextClienteCedula.setBounds(150, 70, 330, 16);
        
        JLabel LabelClienteEmail = new JLabel("Correo electrónico");
        LabelClienteEmail.setBounds(5, 90, 400, 15);
        JTextField TextClienteEmail = new JTextField();
        TextClienteEmail.setBounds(150, 90, 330, 16);
        
        JLabel LabelClienteTelefono = new JLabel("Número de teléfono");
        LabelClienteTelefono.setBounds(5, 110, 400, 15);
        JTextField TextClienteTelefono = new JTextField();
        TextClienteTelefono.setBounds(150, 110, 330, 16);
        
        JLabel LabelClienteDireccion = new JLabel("Dirección exacta");
        LabelClienteDireccion.setBounds(5, 130, 400, 15);
        JTextArea TextClienteDireccion = new JTextArea();
        TextClienteDireccion.setBounds(150, 130, 330, 96);
        
        JLabel LabelClienteNumeroLic = new JLabel("Número de licencia");
        LabelClienteNumeroLic.setBounds(5, 230, 400, 15);
        JTextField TextClienteNumeroLic = new JTextField();
        TextClienteNumeroLic.setBounds(150, 230, 330, 16);
        
        JLabel LabelClienteType = new JLabel("Tipo de licencia");
        LabelClienteType.setBounds(5, 250, 400, 15);
        JTextField TextClienteType = new JTextField();
        TextClienteType.setBounds(150, 250, 330, 16);
        
        String Dia[]={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                    "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                    "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        
        String Mes[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                      "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        String AnoCreacion[]={"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"};
        
        String AnoExpiracion[]={"2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"};
        
        JLabel LabelClienteEmisión = new JLabel("Fecha de emisión de la licencia                     de                                     del");
        LabelClienteEmisión.setBounds(5, 270, 400, 15);
        JComboBox TextClienteEmisiónDia = new JComboBox(Dia);
        TextClienteEmisiónDia.setBounds(200, 270, 40, 16);
        JComboBox TextClienteEmisiónMes = new JComboBox(Mes);
        TextClienteEmisiónMes.setBounds(265, 270, 100, 16);
        JComboBox TextClienteEmisiónAno = new JComboBox(AnoCreacion);
        TextClienteEmisiónAno.setBounds(390, 270, 60, 16);
        
        JLabel LabelClienteExpiración = new JLabel("Fecha de expiración de la licencia                de                                     del");
        LabelClienteExpiración.setBounds(5, 290, 400, 15);
        JComboBox TextClienteExpiracionDia = new JComboBox(Dia);
        TextClienteExpiracionDia.setBounds(200, 290, 40, 16);
        JComboBox TextClienteExpiracionMes = new JComboBox(Mes);
        TextClienteExpiracionMes.setBounds(265, 290, 100, 16);
        JComboBox TextClienteExpiracionAno = new JComboBox(AnoExpiracion);
        TextClienteExpiracionAno.setBounds(390, 290, 60, 16);
        
        JLabel LabelClienteFoto = new JLabel("Fotografía de la licencia");
        LabelClienteFoto.setBounds(5, 310, 400, 15);
        JButton BuscarClienteFoto = new JButton("Buscar...");
        BuscarClienteFoto.setBounds(380, 310, 100, 15);
        JTextField RutaClienteFoto = new JTextField();
        RutaClienteFoto.setBounds(150, 310, 220, 15);
        
        CuadroRegistrarCliente.add(TitleRegistrarCliente);
        CuadroRegistrarCliente.add(VolverRegistrarCliente);
        CuadroRegistrarCliente.add(BotonRegistrarCliente);
        CuadroRegistrarCliente.add(LabelClienteNombre);
        CuadroRegistrarCliente.add(TextClienteNombre);
        CuadroRegistrarCliente.add(LabelClienteCedula);
        CuadroRegistrarCliente.add(TextClienteCedula);
        CuadroRegistrarCliente.add(LabelClienteDireccion);
        CuadroRegistrarCliente.add(TextClienteDireccion);
        CuadroRegistrarCliente.add(LabelClienteEmail);
        CuadroRegistrarCliente.add(TextClienteEmail);
        CuadroRegistrarCliente.add(LabelClienteTelefono);
        CuadroRegistrarCliente.add(TextClienteTelefono);
        CuadroRegistrarCliente.add(LabelClienteFoto);
        CuadroRegistrarCliente.add(BuscarClienteFoto);
        CuadroRegistrarCliente.add(RutaClienteFoto);
        CuadroRegistrarCliente.add(LabelClienteNumeroLic);
        CuadroRegistrarCliente.add(TextClienteNumeroLic);
        CuadroRegistrarCliente.add(LabelClienteType);
        CuadroRegistrarCliente.add(TextClienteType);
        CuadroRegistrarCliente.add(LabelClienteEmisión);
        CuadroRegistrarCliente.add(TextClienteEmisiónDia);
        CuadroRegistrarCliente.add(TextClienteEmisiónMes);
        CuadroRegistrarCliente.add(TextClienteEmisiónAno);
        CuadroRegistrarCliente.add(LabelClienteExpiración);
        CuadroRegistrarCliente.add(TextClienteExpiracionDia);
        CuadroRegistrarCliente.add(TextClienteExpiracionMes);
        CuadroRegistrarCliente.add(TextClienteExpiracionAno);
        
        /*
         *  ###########---Componentes MenuPrincipal---#############
         */
        ventana.add(MenuPrincipal);
    }
    
    
    public static void main(String[] args) {
        Window();
    }
    
}
