<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cronologia Prenotazioni</title>
</head>
<body>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Cronologia prenotazioni</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Prenotazioni</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
								<tr>
									<th>Id</th>
									<th>Nome risorsa</th>
									<th>Nome</th>
									<th>Inizio</th>
									<th>Fine</th>
									<th>Nome utente</th>
								</tr>
							</thead>
						</table>
						<!-- /.table-responsive -->
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
	<script>
		$(document)
				.ready(
						function() {
							$('#dataTables-example')
									.DataTable(
											{
												"ajax" : "/user/getcronologialist",
												
												"columns" : [
														{
															"data" : "id"
														},
														{
															"data" : "risorsa"
														},
														{
															"data" : "nomeP"
														},
														{
															"data" : "inizio"
														},
														{
															"data" : "fine"
														},
														{
															"data" : "appUser"
														}
														]

											});

						});
	</script>
</body>
</html>