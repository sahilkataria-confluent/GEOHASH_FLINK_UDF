package io.confluent.flink.table.modules.remoteudf;

import org.apache.flink.table.functions.ScalarFunction;
import org.locationtech.spatial4j.io.GeohashUtils;


public class RetrieveGeoHash extends ScalarFunction {


    public static void main(String[] args) {
        RetrieveGeoHash retrieve = new RetrieveGeoHash();
        System.out.println(retrieve.eval("45.566565","56.565656",5));
    }



    public String eval(String Lat , String Lon , int Pre) {
        return  GeohashUtils.encodeLatLon(Double.parseDouble(Lat),Double.parseDouble(Lon),Pre);
    }

}


