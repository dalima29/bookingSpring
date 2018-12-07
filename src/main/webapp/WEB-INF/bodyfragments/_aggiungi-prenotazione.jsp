<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Aggiungi Prenotazione</title>
</head>
<body>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Aggiungi
					prenotazione</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Aggiungi prenotazione</div>
					<div class="panel-body">
						<div class="row">
						<h3><font color="red"><b>${erroreRisNonEsiste}</b></font></h3>
						<h3><font color="red"><b>${erroreDataNonDisp}</b></font></h3>
							<div class="col-lg-12">
								<form role="form" method="POST" action="${pageContext.request.contextPath}/user/aggiungi-prenotazione-DB">
									<div class="form-group">
										<label>Id risorsa</label> <input class="form-control"
											type="number" name="IdRis" id="IdRis" 
											placeholder="Inserisci id risorsa" required>
									</div>
									<div class="form-group">
										<label>Data inizio</label> <input class="form-control"
											type="datetime-local" id="inizio" name="inizio" required>
									</div>
									<div class="form-group">
										<label>Periodo</label> <input class="form-control"
											type="number" min="1" 
											placeholder="Inserisci Periodo" id="periodo" name="periodo" required>
									</div>
									<div class="form-group">
										<label>Nome prenotazione</label> <input class="form-control"
											placeholder="Inserisci nome prenotazione" id="nomeP" name="nomeP" required>
									</div>
									<button type="submit" class="btn btn-primary">Prenota</button>
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
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
	</div>
	<!-- /#page-wrapper -->
</body>
</html>