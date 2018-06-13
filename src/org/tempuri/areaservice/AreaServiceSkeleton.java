
/**
 * AreaServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
    package org.tempuri.areaservice;
    /**
     *  AreaServiceSkeleton java skeleton for the axisService
     */
    public class AreaServiceSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
         * @param parameters 
         * @return area 
         */
        
                 public org.tempuri.areaservice.Area calculateRectArea
                  (
                  org.tempuri.areaservice.Parameters parameters
                  )
            {
                org.tempuri.areaservice.Area area = new org.tempuri.areaservice.Area();
                area.setArea(
                		parameters.getParameters().getHeight() * parameters.getParameters().getWidth());
                
                return area;
        }
     
    }
    