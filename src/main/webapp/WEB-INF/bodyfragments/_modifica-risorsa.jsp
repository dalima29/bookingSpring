<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<head>
<title>Modifica risorsa</title>
</head>
<body>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Modifica Risorsa</h1>
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
							<!-- /.col-lg-6 (nested) -->
							<div class="col-lg-6">
								<h1>Modifica</h1>
								<form role="form" action="risorse.html">
									<fieldset disabled>
										<div class="form-group">
											<label for="disabledSelect">Tipo Risorsa</label> <select
												id="disabledSelect" class="form-control">
												<option>Macchina</option>
											</select>
										</div>
										<div class="form-group">
											<label for="disabledSelect">Nome Risorsa</label> <input
												class="form-control" id="disabledInput" type="text"
												placeholder="Toyota Yaris" disabled>
										</div>
									</fieldset>
									<div class="form-group">
										<label>Limite Risorsa</label> <input class="form-control"
											placeholder="Inserisci numero" type="number" required>
									</div>
									<button type="submit" class="btn btn-primary">Modifica</button>
									<button type="reset" class="btn btn-default">Annulla</button>
								</form>
							</div>
							<!-- /.col-lg-6 (nested) -->
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