<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Inicio.aspx.cs" Inherits="WebApplication_sitioweb.Inicio" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<link href="estilos/StyleInicio.css" rel="stylesheet" type="text/css" />

    <title></title>
</head>
<body>
    <form id="form1" runat="server">
      <div class="contenedor">
		<header class="encabezado">
			<h1>srl.CLINICA-2020</h1>
		</header>
		<nav>
			<ul>
				<li><asp:Button CssClass="botton" ID="Button1" runat="server" Text="INICIAR SESSION" OnClick="Button1_Click"  /></li>
				<li><asp:Button CssClass="botton" ID="Button2" runat="server" Text="REGISTRAR NUEVO PACIENTE" OnClick="Button2_Click" /></li>
			</ul>
		</nav>
	</div>
    </form>
</body>
</html>
