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
	<script src="../vendor/jquery/jquery.min.js"></script>

	<!-- DataTables JavaScript -->
	<script src="../vendor/datatables/js/jquery.dataTables.min.js"></script>
	<script src="../vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
	<script src="../vendor/datatables-responsive/dataTables.responsive.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="../dist/js/sb-admin-2.js"></script>
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
														}
														]

											});

						});
	</script>
</body>
</html>