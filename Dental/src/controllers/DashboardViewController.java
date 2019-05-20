/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.AnchorPane;
import utils.DoughnutChart;

/**
 * FXML Controller class
 *
 * @author Mr. ASH
 */
public class DashboardViewController implements Initializable {

    @FXML
    private AnchorPane donutChartHolder;
    @FXML
    private PieChart piechart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        initPieChart();
        initDounutChart();
    }

    private void initPieChart() {
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList(
                new PieChart.Data("Prosthesis", 20d),
                new PieChart.Data("Extraction", 40d),
                new PieChart.Data("Refilling", 25d),
                new PieChart.Data("Carries", 15d)
        );
        piechart.setData(data);
    }

    private void initDounutChart() {
        ObservableList<PieChart.Data> dounutData = FXCollections.observableArrayList(
                new PieChart.Data("Prosthesis", 20),
                new PieChart.Data("Extraction", 40),
                new PieChart.Data("Refilling", 25),
                new PieChart.Data("Carries", 15)
        );

        final DoughnutChart doughnutChart = new DoughnutChart(dounutData);
        donutChartHolder.getChildren().add(doughnutChart);

    }   }
