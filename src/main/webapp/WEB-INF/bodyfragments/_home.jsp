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
							<a href="${pageContext.request.contextPath}/admin/prenotazioni"><span class="pull-left">Vedi
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
							<a href="${pageContext.request.contextPath}/admin/risorse"><span
								class="pull-left">Vedi dettagli</span></a> <span class="pull-right"><i
								class="fa fa-arrow-circle-right"></i></span>
							<div class="clearfix"></div>
						</div>
					</a>
				</div>
			</div>
		</div>
		<!-- /.row -->
	</div>
	<!-- /#page-wrapper -->
</body>