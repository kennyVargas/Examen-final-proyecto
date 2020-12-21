<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="RegistroPaciente.aspx.cs" Inherits="WebApplication_sitioweb.RegistroPaciente" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="estilos/StyleRegistro.css" rel="stylesheet" type="text/css" />
    <title></title>
	
</head>
<body>

	<h1>REGISTRO DE PACIENTES</h1>


    <form id="form1" runat="server">

        	<div class="contenedor">
		<div class="datos1" >
			<ul>
				<li>Documento de Identificacion</li>
				<li> <asp:TextBox ID="TextBox1" TextMode="Number" runat="server" Width="200px"></asp:TextBox></li>
				<li>Nombre</li>
				<li> <asp:TextBox ID="TextBox2" runat="server" Width="200px"></asp:TextBox></li>
				<li>apellido</li>
				<li> <asp:TextBox ID="TextBox3" runat="server" Width="200px"></asp:TextBox></li>
			</ul>
		</div>
		<div class="datos2">
			<ul>
				<li>Contraseña</li>
				<li> <asp:TextBox ID="TextBox4" TextMode="Password" runat="server" Width="200px"></asp:TextBox></li>
				<li>Fecha nacimiento</li>
				<li> <asp:TextBox ID="TextBox5"  TextMode="Date" runat="server" Width="200px"></asp:TextBox></li>
				<li>sexo</li>
				<li><asp:DropDownList ID="addSexo" runat="server">
						<asp:listitem text="MASCULINO" value="MASCULINO"></asp:listitem>
						<asp:listitem text="FEMENINO" value="FEMENINO"></asp:listitem>
				    </asp:DropDownList> </li>
			</ul>
		</div>		
	</div>
	<div class="cont-boton">
			<asp:Button CssClass="botton" ID="Button1" runat="server" Text="LIMPIAR" OnClick="Button1_Click" />
			<asp:Button CssClass="botton" ID="Button2" runat="server" Text="GUARDAR" OnClick="Button2_Click" />
			<asp:Button CssClass="botton" ID="Button3" runat="server" Text="CANCEL" OnClick="Button3_Click" />
	</div>
    </form>
</body>
</html>
