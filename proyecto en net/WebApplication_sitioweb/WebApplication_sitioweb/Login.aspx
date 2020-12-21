<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Login.aspx.cs" Inherits="WebApplication_sitioweb.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

    <link href="estilos/StyleSheet1.css" rel="stylesheet" type="text/css" />

    <title>WEB APLICATION</title>
</head>
<body style="height: 194px">

	<div class="contenedor">
		<p class="titulo">INICIAR SESSION</p>
			<form class="form1" id="form1" runat="server">
				<ul>
					<li>
                        <asp:Label ID="Label1" runat="server" Text="USER: "></asp:Label>
                        <asp:TextBox ID="TextBox1" runat="server" Width="175px"></asp:TextBox>
                    </li>
					<li>
                        <asp:Label ID="Label2" runat="server" Text="password :"></asp:Label>
                        <asp:TextBox ID="TextBox2" TextMode="Password" runat="server" Width="198px"></asp:TextBox>
                    </li>
					<li>
                        <asp:Button CssClass="buttonQ" ID="Button1" runat="server" Text="LOGIN" OnClick="Button1_Click" />
                    </li>
				</ul>
                <asp:Button ID="Button2" runat="server" Text="Inicio" Width="114px" OnClick="Button2_Click" />
		</form>
	</div>
</body>
</html>
