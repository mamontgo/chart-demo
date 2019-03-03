package com.scribsee.chat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.XYShapeAnnotation;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleInsets;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mamon_000 on 3/2/2019.
 */
public class FreejJFreeChartDemo {

    public void temp2() {
        List<DataPoint> points =  DatePointBuilder.build(30);
//        DefaultXYDataset dataset = new DefaultXYDataset();
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("Y = X + 2");
        double i = 0;
        for(DataPoint point: points){
            series.add(i, point.getScore().doubleValue());
            i=i+1;
            //            dataset2.add(point.getScore(), "Name", point.getDate());
        }

        dataset.addSeries(series);

        JFreeChart objChart = ChartFactory.createXYLineChart(
                null,     //Chart title
                null,     //Domain axis label
                null,         //Range axis label
                dataset,         //Chart Data
                PlotOrientation.VERTICAL, // orientation
                false,             // include legend?
                false,             // include tooltips?
                false             // include URLs?
        );
        objChart.setBorderStroke(new BasicStroke(1));
        objChart.setBorderVisible(false);
        objChart.setSubtitles(new ArrayList());
//       objChart.set
//        objChart.setPadding(new RectangleInsets(0,0,0,0));
        objChart.getXYPlot().clearRangeMarkers();
//        objChart.getXYPlot().clearAnnotations();
        objChart.getXYPlot().clearDomainMarkers();
        objChart.setBackgroundImageAlpha(0);
        // x axis
//        objChart.getXYPlot().setAxisOffset(new RectangleInsets(0,0,0,0));
        objChart.getXYPlot().getDomainAxis().setAxisLineVisible(false);
        objChart.getXYPlot().getDomainAxis().setTickLabelsVisible(false);
        objChart.getXYPlot().getDomainAxis().setTickMarksVisible(false);
        objChart.getXYPlot().getDomainAxis().setMinorTickMarksVisible(false);
//        objChart.getXYPlot().getDomainAxis().setCategoryMargin(0);
        objChart.getXYPlot().getDomainAxis().setTickMarkInsideLength(0);
//        objChart.getXYPlot().getDomainAxis().setLabelInsets(new RectangleInsets());
//        objChart.getXYPlot().getDomainAxis().setTickLabelInsets(new RectangleInsets());
//        objChart.getXYPlot().getDomainAxis().setCategoryLabelPositionOffset(0);
//        objChart.getXYPlot().getDomainAxis().clearCategoryLabelToolTips();
        objChart.getXYPlot().getDomainAxis().getPlot().setOutlineVisible(false);
//        objChart.getXYPlot().getDomainAxis().setLowerMargin(0);
//        objChart.getXYPlot().getDomainAxis().setUpperMargin(0);
//        objChart.getXYPlot().getDomainAxis().setCategoryMargin(0);

//       objChart.getCategoryPlot().getDomainAxis().setmarg
        // y axis
//        objChart.getXYPlot().setDomainCrosshairVisible(false);
//        objChart.getXYPlot().setDomainGridlinesVisible(true);
//        objChart.getXYPlot().setRangeGridlinesVisible(false);
//        objChart.getXYPlot().setRangeMinorGridlinesVisible(false);
//        objChart.getXYPlot().setRangeZeroBaselineVisible(false);

        objChart.getXYPlot().getRangeAxis().setLabelInsets(new RectangleInsets(0,0,0,0));
        objChart.getXYPlot().getRangeAxis().setTickLabelInsets(new RectangleInsets(0,0,0,0));
//        objChart.getXYPlot().setBackgroundAlpha(0);
        objChart.getXYPlot().setBackgroundPaint(Color.DARK_GRAY);
//        objChart.getXYPlot().setInsets(new RectangleInsets(10,0,10,0));

        objChart.getXYPlot().getRangeAxis().setAxisLineVisible(false);
        objChart.getXYPlot().getRangeAxis().setTickLabelsVisible(false);
        objChart.getXYPlot().getRangeAxis().setMinorTickMarksVisible(false);
        objChart.getXYPlot().getRangeAxis().setTickMarksVisible(false);


        objChart.getXYPlot().setRenderer(new XYSplineRenderer(3));
        objChart.getXYPlot().getRenderer().setSeriesStroke(0, new BasicStroke(10));
        objChart.getXYPlot().getRenderer().setSeriesPaint(0, Color.GREEN);
        XYLineAndShapeRenderer renderer =
                (XYLineAndShapeRenderer) objChart.getXYPlot().getRenderer();
        renderer.setBaseShapesVisible(false);
        writeImage(objChart, "image2.png");



    }

    public void temp() {

       List<DataPoint> points =  DatePointBuilder.build(30);
       DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();

       for(DataPoint point: points){
           dataset2.addValue(point.getScore(), "Name", point.getDate());
       }



       JFreeChart objChart = ChartFactory.createLineChart(
               null,     //Chart title
               "14 Day Chart:     $12.43  to  $23.21",     //Domain axis label
               null,         //Range axis label
               dataset2,         //Chart Data
               PlotOrientation.VERTICAL, // orientation
               false,             // include legend?
               false,             // include tooltips?
               false             // include URLs?
       );

       objChart.setBorderStroke(new BasicStroke(1));
       objChart.setBorderVisible(true);
       objChart.setSubtitles(new ArrayList());
//       objChart.set
       objChart.setPadding(new RectangleInsets(0,0,0,0));
       objChart.getCategoryPlot().clearRangeMarkers();
       objChart.getCategoryPlot().clearAnnotations();
       objChart.getCategoryPlot().clearDomainMarkers();
       objChart.setBackgroundImageAlpha(0);
       // x axis
       objChart.getCategoryPlot().setAxisOffset(new RectangleInsets(0,0,0,0));
       objChart.getCategoryPlot().getDomainAxis().setAxisLineVisible(false);
       objChart.getCategoryPlot().getDomainAxis().setTickLabelsVisible(false);
       objChart.getCategoryPlot().getDomainAxis().setTickMarksVisible(false);
       objChart.getCategoryPlot().getDomainAxis().setAxisLineVisible(false);
       objChart.getCategoryPlot().getDomainAxis().setMinorTickMarksVisible(false);
       objChart.getCategoryPlot().getDomainAxis().setCategoryMargin(0);
       objChart.getCategoryPlot().getDomainAxis().setTickMarkInsideLength(0);
       objChart.getCategoryPlot().getDomainAxis().setLabelInsets(new RectangleInsets());
       objChart.getCategoryPlot().getDomainAxis().setTickLabelInsets(new RectangleInsets());
       objChart.getCategoryPlot().getDomainAxis().setCategoryLabelPositionOffset(0);
       objChart.getCategoryPlot().getDomainAxis().clearCategoryLabelToolTips();
       objChart.getCategoryPlot().getDomainAxis().getPlot().setOutlineVisible(false);
       objChart.getCategoryPlot().getDomainAxis().setLowerMargin(0);
       objChart.getCategoryPlot().getDomainAxis().setUpperMargin(0);
       objChart.getCategoryPlot().getDomainAxis().setCategoryMargin(0);

//       objChart.getCategoryPlot().getDomainAxis().setmarg
       // y axis
       objChart.getCategoryPlot().setDomainCrosshairVisible(false);
       objChart.getCategoryPlot().setDomainGridlinesVisible(false);
       objChart.getCategoryPlot().setRangeGridlinesVisible(false);
       objChart.getCategoryPlot().setRangeMinorGridlinesVisible(false);
       objChart.getCategoryPlot().setRangeZeroBaselineVisible(false);

       objChart.getCategoryPlot().getRangeAxis().setLabelInsets(new RectangleInsets(0,0,0,0));
       objChart.getCategoryPlot().getRangeAxis().setTickLabelInsets(new RectangleInsets(0,0,0,0));
       objChart.getCategoryPlot().setBackgroundAlpha(0);

       objChart.getCategoryPlot().setInsets(new RectangleInsets(0,0,0,0));

       objChart.getCategoryPlot().getRangeAxis().setAxisLineVisible(false);
       objChart.getCategoryPlot().getRangeAxis().setTickLabelsVisible(false);
       objChart.getCategoryPlot().getRangeAxis().setMinorTickMarksVisible(false);
       objChart.getCategoryPlot().getRangeAxis().setTickMarksVisible(false);
       objChart.getCategoryPlot().getRenderer().setSeriesStroke(0, new BasicStroke(2));
//       objChart.getCategoryPlot().getDrawingSupplier().get


//       objChart.getCategoryPlot().getRangeAxis().re


       //       objChart.getCategoryPlot().getDomainAxis().
//       objChart.getCategoryPlot().clea
        writeImage(objChart, "image.png");


   }

    public void writeImage(JFreeChart objChart, String name) {
        BufferedImage objBufferedImage=objChart.createBufferedImage(500,200);
        ByteArrayOutputStream bas = new ByteArrayOutputStream();
        try {
            ImageIO.write(objBufferedImage, "png", bas);

            byte[] byteArray=bas.toByteArray();
            InputStream in = new ByteArrayInputStream(byteArray);
            BufferedImage image = ImageIO.read(in);
            File outputfile = new File(name);
            ImageIO.write(image, "png", outputfile);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
