<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<head></head>
<body>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Dashboard</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-6 col-md-6">
				<div class="panel panel-green">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-3">
								<i class="fa fa-table fa-5x"></i>
							</div>
							<div class="col-xs-6 text-right">
								<div class="huge">Nuove prenotazioni!</div>
							</div>
						</div>
					</div>
					<a href="#">
						<div class="panel-footer">
							<a href="${pageContext.request.contextPath}/prenotazioni"><span class="pull-left">Vedi
									dettagli</span></a> <span class="pull-right"><i
								class="fa fa-arrow-circle-right"></i></span>
							<div class="clearfix"></div>
						</div>
					</a>
				</div>
			</div>
			<div class="col-lg-6 col-md-6">
				<div class="panel panel-yellow">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-3">
								<i class="fa fa-list fa-5x"></i>
							</div>
							<div class="col-xs-6 text-right">
								<div class="huge">Nuove risorse!</div>
							</div>
						</div>
					</div>
					<a href="#">
						<div class="panel-footer">
							<a href="${pageContext.request.contextPath}/risorse"><span
								class="pull-left">Vedi dettagli</span></a> <span class="pull-right"><i
								class="fa fa-arrow-circle-right"></i></span>
							<div class="clearfix"></div>
						</div>
					</a>
				</div>
			</div>
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-8">
				<div class="panel panel-default">
					<div class="panel-heading">
						<i class="fa fa-bar-chart-o fa-fw"></i> Area Chart Example
						<div class="pull-right">
							<div class="btn-group">
								<button type="button"
									class="btn btn-default btn-xs dropdown-toggle"
									data-toggle="dropdown">
									Actions <span class="caret"></span>
								</button>
								<ul class="dropdown-menu pull-right" role="menu">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li class="divider"></li>
									<li><a href="#">Separated link</a></li>
								</ul>
							</div>
						</div>
					</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<div id="morris-area-chart"></div>
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
				<div class="panel panel-default">
					<div class="panel-heading">
						<i class="fa fa-bar-chart-o fa-fw"></i> Bar Chart Example
						<div class="pull-right">
							<div class="btn-group">
								<button type="button"
									class="btn btn-default btn-xs dropdown-toggle"
									data-toggle="dropdown">
									Actions <span class="caret"></span>
								</button>
								<ul class="dropdown-menu pull-right" role="menu">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li class="divider"></li>
									<li><a href="#">Separated link</a></li>
								</ul>
							</div>
						</div>
					</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-4">
								<div class="table-responsive">
									<table class="table table-bordered table-hover table-striped">
										<thead>
											<tr>
												<th>#</th>
												<th>Date</th>
												<th>Time</th>
												<th>Amount</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>3326</td>
												<td>10/21/2013</td>
												<td>3:29 PM</td>
												<td>$321.33</td>
											</tr>
											<tr>
												<td>3325</td>
												<td>10/21/2013</td>
												<td>3:20 PM</td>
												<td>$234.34</td>
											</tr>
											<tr>
												<td>3324</td>
												<td>10/21/2013</td>
												<td>3:03 PM</td>
												<td>$724.17</td>
											</tr>
											<tr>
												<td>3323</td>
												<td>10/21/2013</td>
												<td>3:00 PM</td>
												<td>$23.71</td>
											</tr>
											<tr>
												<td>3322</td>
												<td>10/21/2013</td>
												<td>2:49 PM</td>
												<td>$8345.23</td>
											</tr>
											<tr>
												<td>3321</td>
												<td>10/21/2013</td>
												<td>2:23 PM</td>
												<td>$245.12</td>
											</tr>
											<tr>
												<td>3320</td>
												<td>10/21/2013</td>
												<td>2:15 PM</td>
												<td>$5663.54</td>
											</tr>
											<tr>
												<td>3319</td>
												<td>10/21/2013</td>
												<td>2:13 PM</td>
												<td>$943.45</td>
											</tr>
										</tbody>
									</table>
								</div>
								<!-- /.table-responsive -->
							</div>
							<!-- /.col-lg-4 (nested) -->
							<div class="col-lg-8">
								<div id="morris-bar-chart"></div>
							</div>
							<!-- /.col-lg-8 (nested) -->
						</div>
						<!-- /.row -->
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
			<!-- /.col-lg-8 -->
			<div class="col-lg-4">
				<!-- /.panel -->
				<div class="panel panel-default">
					<div class="panel-heading">
						<i class="fa fa-bar-chart-o fa-fw"></i> Grafico a ciambella
					</div>
					<div class="panel-body">
						<div id="morris-donut-chart"></div>
						<a href="#" class="btn btn-default btn-block">Vedi dettagli</a>
					</div>
					<!-- /.panel-body -->
				</div>
			</div>
			<!-- /.col-lg-4 -->
		</div>
		<!-- /.row -->
	</div>
	<!-- /#page-wrapper -->
</body>