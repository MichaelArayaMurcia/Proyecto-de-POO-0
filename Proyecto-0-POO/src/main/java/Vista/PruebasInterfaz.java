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
        
        /*
         *  #############################
         *  ########---Submenus---#######
         *  #############################
         */
        
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
         *  #######################################################
         *  ###########---Componentes MenuPrincipal---#############
         *  #######################################################
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
        botonAgregarVehiculo.addActionListener((ActionEvent e) -> {
            MenuPrincipal.setVisible(false);
            ventana.add(MenuAgregarVehiculo);
            MenuAgregarVehiculo.setVisible(true);
            ventana.remove(MenuPrincipal);
        });
        
        JButton botonRegistrarEmpresa = new JButton("Registrar empresa");
        botonRegistrarEmpresa.setBounds(550, 530, 245, 50);
        botonRegistrarEmpresa.addActionListener((ActionEvent e) -> {
            MenuPrincipal.setVisible(false);
            ventana.add(MenuRegistrarEmpresa);
            MenuRegistrarEmpresa.setVisible(true);
            ventana.remove(MenuPrincipal);
        });
        
        JButton botonRegistrarMantenimiento = new JButton("Registrar servicio de mantenimiento");
        botonRegistrarMantenimiento.setBounds(815, 530, 245, 50);
        botonRegistrarMantenimiento.addActionListener((ActionEvent e) -> {
            MenuPrincipal.setVisible(false);
            ventana.add(MenuRegistrarMantenimiento);
            MenuRegistrarMantenimiento.setVisible(true);
            ventana.remove(MenuPrincipal);
        });
        
        JButton botonEditarVehiculo = new JButton("Editar vehiculo");
        botonEditarVehiculo.setBounds(20, 600, 245, 50);
        botonEditarVehiculo.addActionListener((ActionEvent e) -> {
            MenuPrincipal.setVisible(false);
            ventana.add(MenuEditarVehiculo);
            MenuEditarVehiculo.setVisible(true);
            ventana.remove(MenuPrincipal);
        });
        
        JButton botonHacerReserva = new JButton("Hacer una reserva");
        botonHacerReserva.setBounds(285, 600, 245, 50);
        botonHacerReserva.addActionListener((ActionEvent e) -> {
            MenuPrincipal.setVisible(false);
            ventana.add(MenuHacerReserva);
            MenuHacerReserva.setVisible(true);
            ventana.remove(MenuPrincipal);
        });
        
        JButton botonConsultarReserva = new JButton("Consultar una reserva");
        botonConsultarReserva.setBounds(550, 600, 245, 50);
        botonConsultarReserva.addActionListener((ActionEvent e) -> {
            MenuPrincipal.setVisible(false);
            ventana.add(MenuConsultarReserva);
            MenuConsultarReserva.setVisible(true);
            ventana.remove(MenuPrincipal);
        });
        
        JButton botonRegistrarAdmin = new JButton("Registrar usuario 'Servicio al cliente'");
        botonRegistrarAdmin.setBounds(815, 600, 245, 50);
        botonRegistrarAdmin.addActionListener((ActionEvent e) -> {
            MenuPrincipal.setVisible(false);
            ventana.add(MenuRegistrarAdmin);
            MenuRegistrarAdmin.setVisible(true);
            ventana.remove(MenuPrincipal);
        });
        
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
        CuadroRegistrarCliente.setBounds(290, 110, 500, 500);
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
        RutaClienteFoto.setEditable(false);
        
        //----------------------------------------------------------------------
        
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
         *  ###############################################################
         *  ###########---Componentes MenuAgregarVehiculo---###############
         *  ###############################################################
         */
        
        JPanel CuadroAgregarVehiculo = new JPanel();
        CuadroAgregarVehiculo.setBounds(190, 110, 700, 500);
        float[] unColor = Color.RGBtoHSB(107, 208, 255, null);
        CuadroAgregarVehiculo.setBackground(Color.getHSBColor(unColor[0], unColor[1], unColor[2]));
        CuadroAgregarVehiculo.setLayout(null);
        
        String estilo[] = {"Compacto", "Pickup", "Intermedio",
                           "SUV", "Mini-van", "Convertible económico"};
        
        String transmisión[] = {"Automático", "Manual"};
        
        JLabel TitleAgregarVehiculo = new JLabel("Agregar Vehículo");
        TitleAgregarVehiculo.setBounds(300, 5, 500, 20);
        JButton VolverAgregarVehiculo = new JButton("Volver");
        VolverAgregarVehiculo.setBounds(5, 480, 100, 15);
        VolverAgregarVehiculo.addActionListener((ActionEvent e) -> {
            MenuAgregarVehiculo.setVisible(false);
            ventana.add(MenuPrincipal);
            MenuPrincipal.setVisible(true);
            ventana.remove(MenuAgregarVehiculo);
        });
        
        JButton BotonAgregarVehiculo = new JButton("Agregar");
        BotonAgregarVehiculo.setBounds(595, 480, 100, 15);
        
        JLabel LabelVehiculoPlaca = new JLabel("Placa");
        LabelVehiculoPlaca.setBounds(5, 50, 400, 15);
        JTextField TextVehiculoPlaca = new JTextField();
        TextVehiculoPlaca.setBounds(150, 50, 150, 16);
        
        JLabel LabelVehiculoMarca = new JLabel("Marca");
        LabelVehiculoMarca.setBounds(355, 50, 400, 15);
        JTextField TextVehiculoMarca = new JTextField();
        TextVehiculoMarca.setBounds(500, 50, 150, 16);
        
        JLabel LabelVehiculoEstilo = new JLabel("Estilo");
        LabelVehiculoEstilo.setBounds(5, 70, 400, 15);
        JComboBox TextVehiculoEstilo = new JComboBox(estilo);
        TextVehiculoEstilo.setBounds(150, 70, 150, 16);
        
        JLabel LabelVehiculoSucursal = new JLabel("Sucursal");
        LabelVehiculoSucursal.setBounds(355, 70, 400, 15);
        JTextField TextVehiculoSucursal = new JTextField();
        TextVehiculoSucursal.setBounds(500, 70, 150, 16);
        
        JLabel LabelVehiculoColor = new JLabel("Color");
        LabelVehiculoColor.setBounds(5, 90, 400, 15);
        JTextField TextVehiculoColor = new JTextField();
        TextVehiculoColor.setBounds(150, 90, 150, 16);
        
        JLabel LabelVehiculoCapacidad = new JLabel("Capacidad");
        LabelVehiculoCapacidad.setBounds(355, 90, 400, 15);
        JTextField TextVehiculoCapacidad = new JTextField();
        TextVehiculoCapacidad.setBounds(500, 90, 150, 16);
        
        JLabel LabelVehiculoPuertas = new JLabel("Numero de puertas");
        LabelVehiculoPuertas.setBounds(5, 110, 400, 15);
        JTextField TextVehiculoPuertas = new JTextField();
        TextVehiculoPuertas.setBounds(150, 110, 150, 16);
        
        JLabel LabelVehiculoMaletas = new JLabel("Capacidad de maletas");
        LabelVehiculoMaletas.setBounds(355, 110, 400, 15);
        JTextField TextVehiculoMaletas = new JTextField();
        TextVehiculoMaletas.setBounds(500, 110, 150, 16);
        
        JLabel LabelVehiculoFabricacion = new JLabel("Año de fabricación");
        LabelVehiculoFabricacion.setBounds(5, 130, 400, 15);
        JTextField TextVehiculoFabricacion = new JTextField();
        TextVehiculoFabricacion.setBounds(150, 130, 150, 16);
        
        JLabel LabelVehiculoVIN = new JLabel("Numero de Chasis"); //NumeroVin
        LabelVehiculoVIN.setBounds(355, 130, 400, 15);
        JTextField TextVehiculoVIN = new JTextField();
        TextVehiculoVIN.setBounds(500, 130, 150, 16);
        
        JLabel LabelVehiculoTransmision = new JLabel("Transmisión");
        LabelVehiculoTransmision.setBounds(5, 150, 400, 15);
        JComboBox TextVehiculoTransmision = new JComboBox(transmisión);
        TextVehiculoTransmision.setBounds(150, 150, 150, 16);
        
        JLabel LabelVehiculoKilometraje = new JLabel("Kilometraje");
        LabelVehiculoKilometraje.setBounds(355, 150, 400, 15);
        JTextField TextVehiculoKilometraje = new JTextField();
        TextVehiculoKilometraje.setBounds(500, 150, 150, 16);
        
        JLabel LabelVehiculoAlquiler = new JLabel("Costo de Alquiler");
        LabelVehiculoAlquiler.setBounds(5, 170, 400, 15);
        JTextField TextVehiculoAlquiler = new JTextField();
        TextVehiculoAlquiler.setBounds(150, 170, 150, 16);
        
        JLabel LabelVehiculoMPG = new JLabel("MPG (Millas por Galón)");
        LabelVehiculoMPG.setBounds(355, 170, 400, 15);
        JTextField TextVehiculoMPG = new JTextField();
        TextVehiculoMPG.setBounds(500, 170, 150, 16);
        
        JLabel LabelVehiculoFoto = new JLabel("Fotografía del vehículo");
        LabelVehiculoFoto.setBounds(5, 190, 400, 15);
        JButton BuscarVehiculoFoto = new JButton("Buscar...");
        BuscarVehiculoFoto.setBounds(500, 190, 100, 15);
        JTextField RutaVehiculoFoto = new JTextField();
        RutaVehiculoFoto.setBounds(150, 190, 330, 16);
        RutaVehiculoFoto.setEditable(false);
        
        //---------------------------------------------------------------------
        
        CuadroAgregarVehiculo.add(TitleAgregarVehiculo);
        CuadroAgregarVehiculo.add(LabelVehiculoPlaca);
        CuadroAgregarVehiculo.add(TextVehiculoPlaca);
        CuadroAgregarVehiculo.add(LabelVehiculoMarca);
        CuadroAgregarVehiculo.add(TextVehiculoMarca);
        CuadroAgregarVehiculo.add(LabelVehiculoFabricacion);
        CuadroAgregarVehiculo.add(TextVehiculoFabricacion);
        CuadroAgregarVehiculo.add(LabelVehiculoEstilo);
        CuadroAgregarVehiculo.add(TextVehiculoEstilo);
        CuadroAgregarVehiculo.add(LabelVehiculoColor);
        CuadroAgregarVehiculo.add(TextVehiculoColor);
        CuadroAgregarVehiculo.add(LabelVehiculoCapacidad);
        CuadroAgregarVehiculo.add(TextVehiculoCapacidad);
        CuadroAgregarVehiculo.add(LabelVehiculoKilometraje);
        CuadroAgregarVehiculo.add(TextVehiculoKilometraje);
        CuadroAgregarVehiculo.add(LabelVehiculoPuertas);
        CuadroAgregarVehiculo.add(TextVehiculoPuertas);
        CuadroAgregarVehiculo.add(LabelVehiculoVIN);
        CuadroAgregarVehiculo.add(TextVehiculoVIN);
        CuadroAgregarVehiculo.add(LabelVehiculoMPG);
        CuadroAgregarVehiculo.add(TextVehiculoMPG);
        CuadroAgregarVehiculo.add(LabelVehiculoSucursal);
        CuadroAgregarVehiculo.add(TextVehiculoSucursal);
        CuadroAgregarVehiculo.add(LabelVehiculoAlquiler);
        CuadroAgregarVehiculo.add(TextVehiculoAlquiler);
        CuadroAgregarVehiculo.add(LabelVehiculoMaletas);
        CuadroAgregarVehiculo.add(TextVehiculoMaletas);
        CuadroAgregarVehiculo.add(LabelVehiculoTransmision);
        CuadroAgregarVehiculo.add(TextVehiculoTransmision);
        CuadroAgregarVehiculo.add(LabelVehiculoFoto);
        CuadroAgregarVehiculo.add(BuscarVehiculoFoto);
        CuadroAgregarVehiculo.add(RutaVehiculoFoto);
        CuadroAgregarVehiculo.add(VolverAgregarVehiculo);
        CuadroAgregarVehiculo.add(BotonAgregarVehiculo);
        
        MenuAgregarVehiculo.add(CuadroAgregarVehiculo);
        
        /*  
         *  ##############################################################
         *  ###########---Componentes MenuRegistrarEmpresa---#############
         *  ##############################################################
         */
        
        JPanel CuadroRegistrarEmpresa = new JPanel();
        CuadroRegistrarEmpresa.setBounds(340, 160, 400, 400);
        float[] empresarial = Color.RGBtoHSB(107, 154, 255, null);
        CuadroRegistrarEmpresa.setBackground(Color.getHSBColor(empresarial[0], empresarial[1], empresarial[2]));
        CuadroRegistrarEmpresa.setLayout(null);
        
        MenuRegistrarEmpresa.add(CuadroRegistrarEmpresa);
        
        String provincias[] = {"San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón"};
        
        JLabel TitleRegistrarEmpresa = new JLabel("Registrar Empresa");
        TitleRegistrarEmpresa.setBounds(150, 5, 500, 20);
        JButton VolverRegistrarEmpresa = new JButton("Volver");
        VolverRegistrarEmpresa.setBounds(5, 380, 100, 15);
        VolverRegistrarEmpresa.addActionListener((ActionEvent e) -> {
            MenuRegistrarEmpresa.setVisible(false);
            ventana.add(MenuPrincipal);
            MenuPrincipal.setVisible(true);
            ventana.remove(MenuRegistrarEmpresa);
        });
        
        JButton BotonRegistrarEmpresa = new JButton("Registrar");
        BotonRegistrarEmpresa.setBounds(295, 380, 100, 15);
        
        JLabel LabelEmpresaName = new JLabel("Nombre de la empresa");
        LabelEmpresaName.setBounds(5, 50, 400, 15);
        JTextField TextEmpresaName = new JTextField();
        TextEmpresaName.setBounds(150, 50, 230, 16);
        
        JLabel LabelEmpresaRazon = new JLabel("Razón Social");
        LabelEmpresaRazon.setBounds(5, 70, 400, 15);
        JTextField TextEmpresaRazon = new JTextField();
        TextEmpresaRazon.setBounds(150, 70, 230, 16);
        
        JLabel LabelEmpresaCedula = new JLabel("Cédula Jurídica");
        LabelEmpresaCedula.setBounds(5, 90, 400, 15);
        JTextField TextEmpresaCedula = new JTextField();
        TextEmpresaCedula.setBounds(150, 90, 230, 16);
        
        JLabel LabelEmpresaTelefono = new JLabel("Telefono");
        LabelEmpresaTelefono.setBounds(5, 110, 400, 15);
        JTextField TextEmpresaTelefono = new JTextField();
        TextEmpresaTelefono.setBounds(150, 110, 230, 16);
        
        JLabel LabelEmpresaDireccion = new JLabel("Dirección");
        LabelEmpresaDireccion.setBounds(150, 135, 400, 15);
        
        JLabel LabelEmpresaProvincia = new JLabel("Provincia");
        LabelEmpresaProvincia.setBounds(25, 160, 400, 15);
        JComboBox TextEmpresaProvincia = new JComboBox(provincias);
        TextEmpresaProvincia.setBounds(5, 180, 100, 16); 
        
        JLabel LabelEmpresaCanton = new JLabel("Cantón");
        LabelEmpresaCanton.setBounds(155, 160, 400, 15);
        JTextField TextEmpresaCanton = new JTextField();
        TextEmpresaCanton.setBounds(110, 180, 130, 16);
        
        JLabel LabelEmpresaDistrito = new JLabel("Distrito");
        LabelEmpresaDistrito.setBounds(290, 160, 400, 15);
        JTextField TextEmpresaDistrito = new JTextField();
        TextEmpresaDistrito.setBounds(250, 180, 130, 16);
        
        JLabel LabelEmpresaSenal = new JLabel("Señas");
        LabelEmpresaSenal.setBounds(5, 210, 400, 15);
        JTextArea TextEmpresaSenal = new JTextArea();
        TextEmpresaSenal.setBounds(60, 210, 300, 112);
        
        //----------------------------------------------------------------------
        
        CuadroRegistrarEmpresa.add(TitleRegistrarEmpresa);
        CuadroRegistrarEmpresa.add(VolverRegistrarEmpresa);
        CuadroRegistrarEmpresa.add(BotonRegistrarEmpresa);
        CuadroRegistrarEmpresa.add(LabelEmpresaName);
        CuadroRegistrarEmpresa.add(TextEmpresaName);
        CuadroRegistrarEmpresa.add(LabelEmpresaRazon);
        CuadroRegistrarEmpresa.add(TextEmpresaRazon);
        CuadroRegistrarEmpresa.add(LabelEmpresaCedula);
        CuadroRegistrarEmpresa.add(TextEmpresaCedula);
        CuadroRegistrarEmpresa.add(LabelEmpresaTelefono);
        CuadroRegistrarEmpresa.add(TextEmpresaTelefono);
        CuadroRegistrarEmpresa.add(LabelEmpresaDireccion);
        CuadroRegistrarEmpresa.add(LabelEmpresaProvincia);
        CuadroRegistrarEmpresa.add(TextEmpresaProvincia);
        CuadroRegistrarEmpresa.add(LabelEmpresaCanton);
        CuadroRegistrarEmpresa.add(TextEmpresaCanton);
        CuadroRegistrarEmpresa.add(LabelEmpresaDistrito);
        CuadroRegistrarEmpresa.add(TextEmpresaDistrito);
        CuadroRegistrarEmpresa.add(LabelEmpresaSenal);
        CuadroRegistrarEmpresa.add(TextEmpresaSenal);
        
        /*  
         *  ####################################################################
         *  ###########---Componentes MenuRegistrarMantenimiento---#############
         *  ####################################################################
         */
        
        JPanel CuadroRegistrarMantenimiento = new JPanel();
        CuadroRegistrarMantenimiento.setBounds(340, 160, 400, 400);
        float[] reparando = Color.RGBtoHSB(255, 144, 107, null);
        CuadroRegistrarMantenimiento.setBackground(Color.getHSBColor(reparando[0], reparando[1], reparando[2]));
        CuadroRegistrarMantenimiento.setLayout(null);
        
        MenuRegistrarMantenimiento.add(CuadroRegistrarMantenimiento);
        
        JLabel TitleRegistrarMantenimiento = new JLabel("Registrar Servicio de mantenimiento");
        TitleRegistrarMantenimiento.setBounds(100, 5, 500, 20);
        JButton VolverRegistrarMantenimiento = new JButton("Volver");
        VolverRegistrarMantenimiento.setBounds(5, 380, 100, 15);
        VolverRegistrarMantenimiento.addActionListener((ActionEvent e) -> {
            MenuRegistrarMantenimiento.setVisible(false);
            ventana.add(MenuPrincipal);
            MenuPrincipal.setVisible(true);
            ventana.remove(MenuRegistrarMantenimiento);
        });
        
        JButton BotonRegistrarMantenimiento = new JButton("Registrar");
        BotonRegistrarMantenimiento.setBounds(295, 380, 100, 15);
        
        String EmpresasEjemplo[] = {"Rent a Car", "La Toyota", "El Mecánico", "Otro mecánico", "La mutual"};
        
        String CarrosEjemplo[] = {"000000 - Placa - modelo", "000001 - Carro pruebas", "000002 - Carro bonito",
                                  "000003 - Carro feito", "000004 - EL CARRO PERFECTO", "000005 - EL carrito feo"};
        
        String ServiceType[] = {"Preventivo", "Correctivo"};
        
        JLabel LabelMantenimientoID = new JLabel("Identificador del servicio");
        LabelMantenimientoID.setBounds(5, 50, 400, 15);
        JTextField TextMantenimientoID = new JTextField();
        TextMantenimientoID.setBounds(150, 50, 230, 16);
        
        JLabel LabelMantenimientoEmpresa = new JLabel("Empresa a cargo");
        LabelMantenimientoEmpresa.setBounds(5, 70, 400, 15);
        JComboBox TextMantenimientoEmpresa = new JComboBox(EmpresasEjemplo);
        TextMantenimientoEmpresa.setBounds(150, 70, 230, 16);
        
        JLabel LabelMantenimientoVehiculo = new JLabel("Vehiculo");
        LabelMantenimientoVehiculo.setBounds(5, 90, 400, 15);
        JComboBox TextMantenimientoVehiculo = new JComboBox(CarrosEjemplo);
        TextMantenimientoVehiculo.setBounds(150, 90, 230, 16);
        
        JLabel LabelMantenimientoType = new JLabel("Tipo de servicio");
        LabelMantenimientoType.setBounds(5, 110, 400, 15);
        JComboBox TextMantenimientoType = new JComboBox(ServiceType);
        TextMantenimientoType.setBounds(150, 110, 230, 16);
        
        JLabel LabelMantenimientoActividad = new JLabel("Actividad a realizar");
        LabelMantenimientoActividad.setBounds(5, 130, 400, 15);
        JTextField TextMantenimientoActividad = new JTextField();
        TextMantenimientoActividad.setBounds(150, 130, 230, 16);
        
        JLabel LabelMantenimientoStart = new JLabel("Fecha de inicio                                    /                                     /");
        LabelMantenimientoStart.setBounds(5, 150, 400, 15);
        JComboBox TextMantenimientoStartDia = new JComboBox(Dia);
        TextMantenimientoStartDia.setBounds(150, 150, 40, 16);
        JComboBox TextMantenimientoStartMes = new JComboBox(Mes);
        TextMantenimientoStartMes.setBounds(205, 150, 100, 16);
        JComboBox TextMantenimientoStartAno = new JComboBox(AnoExpiracion);
        TextMantenimientoStartAno.setBounds(320, 150, 60, 16);
        
        JLabel LabelMantenimientoFin = new JLabel("Fecha de finalización                        /                                      /");
        LabelMantenimientoFin.setBounds(5, 170, 400, 15);
        JComboBox TextMantenimientoFinDia = new JComboBox(Dia);
        TextMantenimientoFinDia.setBounds(150, 170, 40, 16);
        JComboBox TextMantenimientoFinMes = new JComboBox(Mes);
        TextMantenimientoFinMes.setBounds(205, 170, 100, 16);
        JComboBox TextMantenimientoFinAno = new JComboBox(AnoExpiracion);
        TextMantenimientoFinAno.setBounds(320, 170, 60, 16);
        
        JLabel LabelMantenimientoMoney = new JLabel("Monto pagado");
        LabelMantenimientoMoney.setBounds(5, 190, 400, 15);
        JTextField TextMantenimientoMoney = new JTextField();
        TextMantenimientoMoney.setBounds(150, 190, 230, 16);
        
        //----------------------------------------------------------------------
        
        CuadroRegistrarMantenimiento.add(TitleRegistrarMantenimiento);
        CuadroRegistrarMantenimiento.add(VolverRegistrarMantenimiento);
        CuadroRegistrarMantenimiento.add(BotonRegistrarMantenimiento);
        CuadroRegistrarMantenimiento.add(LabelMantenimientoID);
        CuadroRegistrarMantenimiento.add(TextMantenimientoID);
        CuadroRegistrarMantenimiento.add(LabelMantenimientoEmpresa);
        CuadroRegistrarMantenimiento.add(TextMantenimientoEmpresa);
        CuadroRegistrarMantenimiento.add(LabelMantenimientoVehiculo);
        CuadroRegistrarMantenimiento.add(TextMantenimientoVehiculo);
        CuadroRegistrarMantenimiento.add(LabelMantenimientoType);
        CuadroRegistrarMantenimiento.add(TextMantenimientoType);
        CuadroRegistrarMantenimiento.add(LabelMantenimientoActividad);
        CuadroRegistrarMantenimiento.add(TextMantenimientoActividad);
        CuadroRegistrarMantenimiento.add(LabelMantenimientoStart);
        CuadroRegistrarMantenimiento.add(TextMantenimientoStartDia);
        CuadroRegistrarMantenimiento.add(TextMantenimientoStartMes);
        CuadroRegistrarMantenimiento.add(TextMantenimientoStartAno);
        CuadroRegistrarMantenimiento.add(LabelMantenimientoFin);
        CuadroRegistrarMantenimiento.add(TextMantenimientoFinDia);
        CuadroRegistrarMantenimiento.add(TextMantenimientoFinMes);
        CuadroRegistrarMantenimiento.add(TextMantenimientoFinAno);
        CuadroRegistrarMantenimiento.add(LabelMantenimientoMoney);
        CuadroRegistrarMantenimiento.add(TextMantenimientoMoney);
        
        /*  
         *  ############################################################
         *  ###########---Componentes MenuEditarVehiculo---#############
         *  ############################################################
         */
        
        JPanel CuadroEditarVehiculo = new JPanel();
        CuadroEditarVehiculo.setBounds(190, 110, 700, 500);
        float[] moradito = Color.RGBtoHSB(146, 107, 255, null);
        CuadroEditarVehiculo.setBackground(Color.getHSBColor(moradito[0], moradito[1], moradito[2]));
        CuadroEditarVehiculo.setLayout(null);
        
        MenuEditarVehiculo.add(CuadroEditarVehiculo);
        
        JLabel TitleEditarVehiculo = new JLabel("Editar Vehículo");
        TitleEditarVehiculo.setBounds(315, 5, 500, 20);
        JButton VolverEditarVehiculo = new JButton("Volver");
        VolverEditarVehiculo.setBounds(5, 480, 100, 15);
        VolverEditarVehiculo.addActionListener((ActionEvent e) -> {
            MenuEditarVehiculo.setVisible(false);
            ventana.add(MenuPrincipal);
            MenuPrincipal.setVisible(true);
            ventana.remove(MenuEditarVehiculo);
        });
        
        String Placas[] = {"000000", "000001", "000002", "000003", "000004", "000005"};
        
        JButton BotonEditarVehiculo = new JButton("Guardar cambios");
        BotonEditarVehiculo.setBounds(545, 480, 150, 15);
        
        JLabel LabelEditarPlaca = new JLabel("Placa");
        LabelEditarPlaca.setBounds(5, 50, 400, 15);
        JComboBox TextEditarPlaca = new JComboBox(Placas);
        TextEditarPlaca.setBounds(150, 50, 150, 16);
        
        JLabel LabelEditarMarca = new JLabel("Marca");
        LabelEditarMarca.setBounds(355, 50, 400, 15);
        JTextField TextEditarMarca = new JTextField();
        TextEditarMarca.setBounds(500, 50, 150, 16);
        
        JLabel LabelEditarEstilo = new JLabel("Estilo");
        LabelEditarEstilo.setBounds(5, 70, 400, 15);
        JComboBox TextEditarEstilo = new JComboBox(estilo);
        TextEditarEstilo.setBounds(150, 70, 150, 16);
        
        JLabel LabelEditarSucursal = new JLabel("Sucursal");
        LabelEditarSucursal.setBounds(355, 70, 400, 15);
        JTextField TextEditarSucursal = new JTextField();
        TextEditarSucursal.setBounds(500, 70, 150, 16);
        
        JLabel LabelEditarColor = new JLabel("Color");
        LabelEditarColor.setBounds(5, 90, 400, 15);
        JTextField TextEditarColor = new JTextField();
        TextEditarColor.setBounds(150, 90, 150, 16);
        
        JLabel LabelEditarCapacidad = new JLabel("Capacidad");
        LabelEditarCapacidad.setBounds(355, 90, 400, 15);
        JTextField TextEditarCapacidad = new JTextField();
        TextEditarCapacidad.setBounds(500, 90, 150, 16);
        
        JLabel LabelEditarPuertas = new JLabel("Numero de puertas");
        LabelEditarPuertas.setBounds(5, 110, 400, 15);
        JTextField TextEditarPuertas = new JTextField();
        TextEditarPuertas.setBounds(150, 110, 150, 16);
        
        JLabel LabelEditarMaletas = new JLabel("Capacidad de maletas");
        LabelEditarMaletas.setBounds(355, 110, 400, 15);
        JTextField TextEditarMaletas = new JTextField();
        TextEditarMaletas.setBounds(500, 110, 150, 16);
        
        JLabel LabelEditarFabricacion = new JLabel("Año de fabricación");
        LabelEditarFabricacion.setBounds(5, 130, 400, 15);
        JTextField TextEditarFabricacion = new JTextField();
        TextEditarFabricacion.setBounds(150, 130, 150, 16);
        
        JLabel LabelEditarVIN = new JLabel("Numero de Chasis"); //NumeroVin
        LabelEditarVIN.setBounds(355, 130, 400, 15);
        JTextField TextEditarVIN = new JTextField();
        TextEditarVIN.setBounds(500, 130, 150, 16);
        
        JLabel LabelEditarTransmision = new JLabel("Transmisión");
        LabelEditarTransmision.setBounds(5, 150, 400, 15);
        JComboBox TextEditarTransmision = new JComboBox(transmisión);
        TextEditarTransmision.setBounds(150, 150, 150, 16);
        
        JLabel LabelEditarKilometraje = new JLabel("Kilometraje");
        LabelEditarKilometraje.setBounds(355, 150, 400, 15);
        JTextField TextEditarKilometraje = new JTextField();
        TextEditarKilometraje.setBounds(500, 150, 150, 16);
        
        JLabel LabelEditarAlquiler = new JLabel("Costo de Alquiler");
        LabelEditarAlquiler.setBounds(5, 170, 400, 15);
        JTextField TextEditarAlquiler = new JTextField();
        TextEditarAlquiler.setBounds(150, 170, 150, 16);
        
        JLabel LabelEditarMPG = new JLabel("MPG (Millas por Galón)");
        LabelEditarMPG.setBounds(355, 170, 400, 15);
        JTextField TextEditarMPG = new JTextField();
        TextEditarMPG.setBounds(500, 170, 150, 16);
        
        JLabel LabelEditarFoto = new JLabel("Fotografía del vehículo");
        LabelEditarFoto.setBounds(5, 190, 400, 15);
        JButton BuscarEditarFoto = new JButton("Buscar...");
        BuscarEditarFoto.setBounds(500, 190, 100, 15);
        JTextField RutaEditarFoto = new JTextField();
        RutaEditarFoto.setBounds(150, 190, 330, 16);
        RutaEditarFoto.setEditable(false);
        
        //---------------------------------------------------------------------
        
        CuadroEditarVehiculo.add(TitleEditarVehiculo);
        CuadroEditarVehiculo.add(VolverEditarVehiculo);
        CuadroEditarVehiculo.add(LabelEditarPlaca);
        CuadroEditarVehiculo.add(TextEditarPlaca);
        CuadroEditarVehiculo.add(LabelEditarMarca);
        CuadroEditarVehiculo.add(TextEditarMarca);
        CuadroEditarVehiculo.add(LabelEditarFabricacion);
        CuadroEditarVehiculo.add(TextEditarFabricacion);
        CuadroEditarVehiculo.add(LabelEditarEstilo);
        CuadroEditarVehiculo.add(TextEditarEstilo);
        CuadroEditarVehiculo.add(LabelEditarColor);
        CuadroEditarVehiculo.add(TextEditarColor);
        CuadroEditarVehiculo.add(LabelEditarCapacidad);
        CuadroEditarVehiculo.add(TextEditarCapacidad);
        CuadroEditarVehiculo.add(LabelEditarKilometraje);
        CuadroEditarVehiculo.add(TextEditarKilometraje);
        CuadroEditarVehiculo.add(LabelEditarPuertas);
        CuadroEditarVehiculo.add(TextEditarPuertas);
        CuadroEditarVehiculo.add(LabelEditarVIN);
        CuadroEditarVehiculo.add(TextEditarVIN);
        CuadroEditarVehiculo.add(LabelEditarMPG);
        CuadroEditarVehiculo.add(TextEditarMPG);
        CuadroEditarVehiculo.add(LabelEditarSucursal);
        CuadroEditarVehiculo.add(TextEditarSucursal);
        CuadroEditarVehiculo.add(LabelEditarAlquiler);
        CuadroEditarVehiculo.add(TextEditarAlquiler);
        CuadroEditarVehiculo.add(LabelEditarMaletas);
        CuadroEditarVehiculo.add(TextEditarMaletas);
        CuadroEditarVehiculo.add(LabelEditarTransmision);
        CuadroEditarVehiculo.add(TextEditarTransmision);
        CuadroEditarVehiculo.add(LabelEditarFoto);
        CuadroEditarVehiculo.add(BuscarEditarFoto);
        CuadroEditarVehiculo.add(RutaEditarFoto);
        CuadroEditarVehiculo.add(VolverEditarVehiculo);
        CuadroEditarVehiculo.add(BotonEditarVehiculo);
        
        /*  
         *  ############################################################
         *  ###########---Componentes MenuHacerReserva---#############
         *  ############################################################
         */
        
        JPanel CuadroHacerReserva = new JPanel();
        CuadroHacerReserva.setBounds(340, 160, 400, 400);
        float[] verdecito = Color.RGBtoHSB(109, 255, 107, null);
        CuadroHacerReserva.setBackground(Color.getHSBColor(verdecito[0], verdecito[1], verdecito[2]));
        CuadroHacerReserva.setLayout(null);
        
        MenuHacerReserva.add(CuadroHacerReserva);
        
        JLabel TitleHacerReserva = new JLabel("Realizar Reserva");
        TitleHacerReserva.setBounds(150, 5, 500, 20);
        JButton VolverHacerReserva = new JButton("Volver");
        VolverHacerReserva.setBounds(5, 380, 100, 15);
        VolverHacerReserva.addActionListener((ActionEvent e) -> {
            MenuHacerReserva.setVisible(false);
            ventana.add(MenuPrincipal);
            MenuPrincipal.setVisible(true);
            ventana.remove(MenuHacerReserva);
        });
        
        //----------------------------------------------------------------------
        
        CuadroHacerReserva.add(TitleHacerReserva);
        CuadroHacerReserva.add(VolverHacerReserva);
        
        /*  
         *  ##############################################################
         *  ###########---Componentes MenuConsultarReserva---#############
         *  ##############################################################
         */
        
        JPanel CuadroConsultarReserva = new JPanel();
        CuadroConsultarReserva.setBounds(340, 160, 400, 400);
        float[] limoncito = Color.RGBtoHSB(198, 255, 107, null);
        CuadroConsultarReserva.setBackground(Color.getHSBColor(limoncito[0], limoncito[1], limoncito[2]));
        CuadroConsultarReserva.setLayout(null);
        
        MenuConsultarReserva.add(CuadroConsultarReserva);
        
        JLabel TitleConsultarReserva = new JLabel("Consultar Reserva");
        TitleConsultarReserva.setBounds(150, 5, 500, 20);
        JButton VolverConsultarReserva = new JButton("Volver");
        VolverConsultarReserva.setBounds(5, 380, 100, 15);
        VolverConsultarReserva.addActionListener((ActionEvent e) -> {
            MenuConsultarReserva.setVisible(false);
            ventana.add(MenuPrincipal);
            MenuPrincipal.setVisible(true);
            ventana.remove(MenuConsultarReserva);
        });
        
        //----------------------------------------------------------------------
        
        CuadroConsultarReserva.add(TitleConsultarReserva);
        CuadroConsultarReserva.add(VolverConsultarReserva);
        
        /*  
         *  ############################################################
         *  ###########---Componentes MenuRegistrarAdmin---#############
         *  ############################################################
         */
        
        JPanel CuadroRegistrarAdmin = new JPanel();
        CuadroRegistrarAdmin.setBounds(290, 110, 500, 500);
        float[] rosa = Color.RGBtoHSB(255, 107, 248, null);
        CuadroRegistrarAdmin.setBackground(Color.getHSBColor(rosa[0], rosa[1], rosa[2]));
        CuadroRegistrarAdmin.setLayout(null);
        
        MenuRegistrarAdmin.add(CuadroRegistrarAdmin);
        
        JLabel TitleRegistrarAdmin = new JLabel("Registrar Usuario con rol de Servicio al cliente");
        TitleRegistrarAdmin.setBounds(100, 5, 500, 20);
        JButton VolverRegistrarAdmin = new JButton("Volver");
        VolverRegistrarAdmin.setBounds(5, 480, 100, 15);
        VolverRegistrarAdmin.addActionListener((ActionEvent e) -> {
            MenuRegistrarAdmin.setVisible(false);
            ventana.add(MenuPrincipal);
            MenuPrincipal.setVisible(true);
            ventana.remove(MenuRegistrarAdmin);
        });
        
        JButton BotonRegistrarAdmin = new JButton("Registrar");
        BotonRegistrarAdmin.setBounds(395, 480, 100, 15);
        
        JLabel LabelAdminNombre = new JLabel("Nombre Completo");
        LabelAdminNombre.setBounds(5, 50, 400, 15);
        JTextField TextAdminNombre = new JTextField();
        TextAdminNombre.setBounds(150, 50, 330, 16);
        
        JLabel LabelAdminCedula = new JLabel("Cédula");
        LabelAdminCedula.setBounds(5, 70, 400, 15);
        JTextField TextAdminCedula = new JTextField();
        TextAdminCedula.setBounds(150, 70, 330, 16);
        
        JLabel LabelAdminEmail = new JLabel("Correo electrónico");
        LabelAdminEmail.setBounds(5, 90, 400, 15);
        JTextField TextAdminEmail = new JTextField();
        TextAdminEmail.setBounds(150, 90, 330, 16);
        
        JLabel LabelAdminTelefono = new JLabel("Número de teléfono");
        LabelAdminTelefono.setBounds(5, 110, 400, 15);
        JTextField TextAdminTelefono = new JTextField();
        TextAdminTelefono.setBounds(150, 110, 330, 16);
        
        JLabel LabelAdminDireccion = new JLabel("Dirección exacta");
        LabelAdminDireccion.setBounds(5, 130, 400, 15);
        JTextArea TextAdminDireccion = new JTextArea();
        TextAdminDireccion.setBounds(150, 130, 330, 96);
        
        JLabel LabelAdminFoto = new JLabel("Fotografía del usuario");
        LabelAdminFoto.setBounds(5, 240, 400, 15);
        JButton BuscarAdminFoto = new JButton("Buscar...");
        BuscarAdminFoto.setBounds(380, 240, 100, 15);
        JTextField RutaAdminFoto = new JTextField();
        RutaAdminFoto.setBounds(150, 240, 220, 15);
        RutaAdminFoto.setEditable(false);
        
        //----------------------------------------------------------------------
        
        CuadroRegistrarAdmin.add(BotonRegistrarAdmin);
        CuadroRegistrarAdmin.add(LabelAdminNombre);
        CuadroRegistrarAdmin.add(TextAdminNombre);
        CuadroRegistrarAdmin.add(LabelAdminCedula);
        CuadroRegistrarAdmin.add(TextAdminCedula);
        CuadroRegistrarAdmin.add(LabelAdminDireccion);
        CuadroRegistrarAdmin.add(TextAdminDireccion);
        CuadroRegistrarAdmin.add(LabelAdminEmail);
        CuadroRegistrarAdmin.add(TextAdminEmail);
        CuadroRegistrarAdmin.add(LabelAdminTelefono);
        CuadroRegistrarAdmin.add(TextAdminTelefono);
        CuadroRegistrarAdmin.add(LabelAdminFoto);
        CuadroRegistrarAdmin.add(BuscarAdminFoto);
        CuadroRegistrarAdmin.add(RutaAdminFoto);
        CuadroRegistrarAdmin.add(TitleRegistrarAdmin);
        CuadroRegistrarAdmin.add(VolverRegistrarAdmin);
        
        //Instrucción final...
        
        ventana.add(MenuPrincipal);
    }
    
    
    public static void main(String[] args) {
        Window();
    }
    
}
