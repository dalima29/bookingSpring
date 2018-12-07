<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Cerca disponibilitÓ</title>
</head>
<body>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Cerca disponibilitÓ</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Cerca disponibilitÓ</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form role="form" method="POST" action="${pageContext.request.contextPath}/user/cerca-disponibilita-DB">
									<div class="form-group">
										<label>Tipo Risorsa</label> <select class="form-control"
											required>
											<option disabled selected value>seleziona tipo
												risorsa</option>
											<option>Aula</option>
											<option>Macchina</option>
											<option>Portatile</option>
										</select>
									</div>
									<div class="form-group">
										<label>Periodo</label> <input class="form-control"
											placeholder="Inserisci numero ore" type="number" min="1"
											required>
									</div>
									<div class="form-group">
										<label>Data inizio ricerca</label> <input class="form-control"
											type="datetime-local" required>
									</div>
									<div class="form-group">
										<label>Data fine ricerca</label> <input class="form-control"
											type="datetime-local">
									</div>
									<div class="form-group">
										<label>Nome Risorsa</label> <input class="form-control"
											placeholder="Inserisci nome risorsa">
									</div>
									<div class="form-group">
										<label>Limite</label> <input class="form-control"
											placeholder="Inserisci limite" type="number" min="1">
									</div>
									<button type="submit" class="btn btn-primary">Verifica</button>
									<button type="reset" class="btn btn-default">Reset</button>
								</form>
							</div>
						</div>
						<!-- /.row (nested) -->
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
		</div>
		<!-- /.row -->
	</div>
	<!-- /#page-wrapper -->
</body>
</html>