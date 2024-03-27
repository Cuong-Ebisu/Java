package hcmute.model;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {
	private Long id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String manufacturer;
    private Date releaseDate;
    private String imagePath;
    
    private MultipartFile imageFile;
    private Boolean isEdit = false;
}
