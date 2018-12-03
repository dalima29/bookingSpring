<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<head>
<title>Aggiungi-risorsa</title>
</head>
<body>
<%String name = (String)session.getAttribute("name");
String error = (String)session.getAttribute("errore");
%>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Aggiungi Risorsa</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Form</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
							<font color="red"><b><%=error!=null?error:""%></b></font>
								<form role="form" method="POST" action="${pageContext.request.contextPath}/admin/aggiungi-risorsa-DB">
									<div class="form-group">
										<label>Tipo Risorsa</label> <select class="form-control"
											name="tipo" id="tipo" required>
											<option disabled selected value>Seleziona tipo
												risorsa</option>
											<option>Aula</option>
											<option>Macchina</option>
											<option>Portatile</option>
										</select>
									</div>
									<div class="form-group">
										<label>Nome Risorsa</label> <input class="form-control"
											placeholder="Inserisci testo" id="name" name="name" value
											="<%=name !=null?name: "" %>"required>
									</div>
									<div class="form-group">
										<label>Limite Risorsa</label> <input class="form-control"
											placeholder="Inserisci numero" id="limite"
											name="limite" type="number" min="1" required>
									</div>
									<button type="submit" class="btn btn-primary">Aggiungi</button>
									<button type="reset" class="btn btn-default">Annulla</button>
								</form>
							</div>
						</div>
						<!-- /.row (nested) -->
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
	</div>
	<!-- /#page-wrapper -->
</body>