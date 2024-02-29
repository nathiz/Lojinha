package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    private LocalDate manufacturDate;

    public UsedProduct(String name, Double price, LocalDate manufacturDate) {
        super(name, price);
        this.manufacturDate = manufacturDate;
    }

    @Override
	public String priceTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ manufacturDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}

    public LocalDate getManufacturDate() {
        return manufacturDate;
    }

    public void setManufacturDate(LocalDate manufacturDate) {
        this.manufacturDate = manufacturDate;
    }
    
}
