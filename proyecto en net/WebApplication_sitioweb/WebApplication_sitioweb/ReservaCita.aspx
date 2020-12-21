<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="ReservaCita.aspx.cs" Inherits="WebApplication_sitioweb.ReservaCita" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="estilos/StyleReservaCita.css" rel="stylesheet" />
    <title></title>
</head>
<body>
	<h1>RESERVAR CITA MEDICA</h1>
    <form id="form1" runat="server">
      <div class="contenedor">
		<ul>
			<li> <asp:Label ID="Label1" runat="server" Text="IDENTIFICADOR DE PACIENTE"></asp:Label></li>
			<li> <asp:TextBox ID="TextBox1" runat="server"  Width="227px" TextMode="Number"></asp:TextBox></li>
			<li> <asp:Label ID="Label2" runat="server" Text="FECHA DE LA RESERVA"></asp:Label></li>
			<li> <asp:TextBox ID="TextBox2" runat="server" Width="220px" TextMode="Date"></asp:TextBox></li>
			<li><asp:DropDownList ID="Idespecialidad" runat="server">
						<asp:listitem text="Traumatologia" value="1"></asp:listitem>
						<asp:listitem text="Urologia" value="2"></asp:listitem>
						<asp:listitem text="Cardiologia" value="3"></asp:listitem>
						<asp:listitem text="Pediatria" value="4"></asp:listitem>
				</asp:DropDownList>
			</li>
			
		</ul>
		
		<p> <asp:Button CssClass="botton" ID="Button1" runat="server" Text="RESERVAR CITA" OnClick="Button1_Click" /></p>
	</div>
	
        <asp:GridView ID="GridView1" CssClass="content-lis" runat="server" Width="430px" AutoGenerateColumns="false">
			<Columns>
					
				<asp:BoundField DataField="Nombre" HeaderText="Nombre" />
				<asp:BoundField DataField="Apellido" HeaderText="Apellido" />
				<asp:BoundField DataField="horario" HeaderText="horario" />
				<asp:TemplateField>
					<ItemTemplate>
						<asp:LinkButton ID="LinkBoton" Text="Cita" runat="server" CommandArgument='<%# Eval("ci") +"," + Eval("horario") +"," + Eval("Nombre")+"," + Eval("Apellido") %>' OnClick="ReservarCita">	</asp:LinkButton>
					</ItemTemplate>
				</asp:TemplateField>
			</Columns>
        </asp:GridView>
	
   
        <asp:Panel CssClass="resultado" ID="Panel1" runat="server" Width="373px" Height="236px">
			<h1>Datos de la reserva</h1> <br />
            <asp:Label ID="Label3" runat="server" Text="Nombre medico :"></asp:Label>
			<asp:TextBox ID="TextBox3" runat="server" Width="237px"></asp:TextBox><br /><br />
            <asp:Label ID="Label4" runat="server" Text="Horario      :"></asp:Label>
            <asp:TextBox ID="TextBox4" runat="server"></asp:TextBox><br /><br />
            <asp:Label ID="Label5" runat="server" Text="fecha"></asp:Label>
            <asp:TextBox ID="TextBox5" runat="server" TextMode="Date" Width="153px" ></asp:TextBox><br /><br />
            <asp:Label ID="Label6" runat="server" Text="Paciente"></asp:Label>
            <asp:TextBox ID="TextBox6" runat="server"></asp:TextBox>
        </asp:Panel>
        <p style="text-align:center; width: 334px; margin-left:auto;">
            <asp:Button ID="Button2" CssClass="botton" runat="server" Text="TERMINAR SESSION" OnClick="Button2_Click" /></p>

    </form>
</body>
</html>
