/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.bean;

import com.exam.pojo.Flat2;
import com.exam.pojo.Sales;
import java.util.List;

/**
 *
 * @author apcl
 */
public interface SalesModel {
    public boolean doInsertSales(Sales sales);
    public boolean doUpdateSales(Sales sales);
    public boolean doDeleteSales(Sales sales);
    public List<Sales> findAllSales();
    public Sales findSalesById(int salesId);
    public List<Integer> allFlatNo();
    public List<Flat2> findFlatById(int flatId);
}
