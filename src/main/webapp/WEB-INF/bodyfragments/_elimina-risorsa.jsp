<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<head>
<title>Elimina risorsa</title>
</head>
<body>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Elimina Risorsa</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading"></div>
					<div class="panel-body">
					<h3><font color="red"><b>${erroreElimina}</b></font></h3>
						<div class="row">
							<!-- /.col-lg-6 (nested) -->
							<div class="col-lg-12">
								<h1>Elimina</h1>
								<form role="form" method="POST"
									action="${pageContext.request.contextPath}/admin/elimina-risorsa-DB">

									<div class="form-group">
										<label>Nome Risorsa</label> <input class="form-control"
											id="nome-risorsa" name="nome-risorsa" type="text"
											placeholder="Inserisci nome risorsa" required>
									</div>
									<button type="submit" class="btn btn-primary">Elimina</button>
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