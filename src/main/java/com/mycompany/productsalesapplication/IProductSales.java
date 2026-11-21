package com.mycompany.productsalesapplication;

/**
 * This interface defines the operations that any product sales class must provide.
 * Any class that implements this interface must supply its own version of
 * every method below.
 *
 * @author Amahle Lisah Khumalo
 */

public interface IProductSales
{ //beginning of interface

    // Returns the full two-dimensional array of sales figures
    int[][] GetProductSales();

    // Returns the sum of every sales figure in the array
    int GetTotalSales();

    // Returns how many sales figures are above the sales limit
    int GetSalesOverLimit();

    // Returns how many sales figures are below the sales limit
    int GetSalesUnderLimit();

    // Returns how many rows of sales data were processed
    int GetProductsProcessed();

    // Returns the average of all the sales figures
    double GetAverageSales();
}// end of interface