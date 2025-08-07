module SaleStock {
	requires transitive javafx.base;
	requires javafx.controls;
	requires javafx.media;
	requires javafx.web;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
	opens application.controller to javafx.fxml;
	exports application.controller to javafx.fxml;
}
