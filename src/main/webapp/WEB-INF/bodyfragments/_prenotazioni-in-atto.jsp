<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prenotazioni in atto</title>
</head>
<body>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Prenotazioni correnti</h1>
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
						<div>

							<span><a
								href="${pageContext.request.contextPath}/user/aggiungi-prenotazione"><button
										type="button" class="btn btn-default btn-circle">
										<i class="fa fa-plus"></i>
									</button></a></span> <span>Aggiungi prenotazione</span>
						</div>

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
									<th></th>
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

	<script>
		$(document)
				.ready(
						function() {
							$('#dataTables-example')
									.DataTable(
											{
												"ajax" : "/user/getprenotazionicorrentilist",

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
															"data" : "inizio",
															"render" : function(
																	data, type,
																	row) {
																var x = new Date(
																		data);
																return new Date(
																		x
																				.getTime()
																				- (x
																						.getTimezoneOffset() * 60000))
																		.toJSON();
															}
														},
														{
															"data" : "fine",
															"render" : function(
																	data, type,
																	row) {
																var x = new Date(
																		data);
																return new Date(
																		x
																				.getTime()
																				- (x
																						.getTimezoneOffset() * 60000))
																		.toJSON();
															}
														},
														{
															"defaultContent" : '<a href="${pageContext.request.contextPath}/user/rimuovi-prenotazione"><button type="button" class="btn btn-default btn-circle"> <i class="fa fa-trash-o"></i> </button></a>'
														} ]

											});

						});
	</script>
</body>
</html>