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
							<h3>
								<font color="red"><b>${erroreRisNonEsiste}</b></font>
							</h3>
							<h3>
								<font color="red"><b>${erroreDataNonDisp}</b></font>
							</h3>
							<div class="col-lg-12">
								<form role="form" method="POST"
									action="${pageContext.request.contextPath}/user/cerca-disponibilita-DB">
									<div class="form-group">
										<label>Data inizio ricerca</label> <input class="form-control"
											type="datetime-local" id="inizio" name="inizio"
											min='2018-12-01T00:00' required>
									</div>
									<div class="form-group">
										<label>Data fine ricerca</label> <input id="fine" name="fine"
											class="form-control" type="datetime-local" 
											min='2018-12-01T00:00' required>
									</div>
									<div class="form-group">
										<label>Id Risorsa</label> <input id="idR" name="idR"
											class="form-control" placeholder="Inserisci nome risorsa"
											type="number" required>
									</div>
									<div class="form-group">
										<label>Durata</label> <input id="durata" name="durata"
											class="form-control" placeholder="Inserisci durata"
											type="number" min="1" required>
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
	<script>
		var today = new Date();
		var dd = today.getDate();
		var mm = today.getMonth() + 1; //January is 0!
		var yyyy = today.getFullYear();
		if (dd < 10) {
			dd = '0' + dd
		}
		if (mm < 10) {
			mm = '0' + mm
		}

		today = yyyy + '-' + mm + '-' + dd + "T00:00";
		document.getElementById("inizio").setAttribute("min", today);
		document.getElementById("fine").setAttribute("min", today);
	</script>
</body>
</html>