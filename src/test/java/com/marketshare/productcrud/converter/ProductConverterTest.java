package com.marketshare.productcrud.converter;

import com.marketshare.productcrud.domain.Product;
import com.marketshare.productcrud.dto.ProductDTO;
import com.marketshare.productcrud.mock.MockProduct;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ProductConverterTest {

    private MockProduct inputObject;

    @Before
    public void setUp() {
        inputObject = new MockProduct();
    }

    @Test
    public void parseDomainToDTOTest() {
        Product product = inputObject.mockDomain();
        ProductDTO productDTO = ProductConverter.toDTO(product);

        Assert.assertEquals(product.getId(), productDTO.getId());
        Assert.assertEquals(product.getName(), productDTO.getName());
        Assert.assertEquals(product.getDescription(), productDTO.getDescription());
        Assert.assertEquals(product.getBrand(), productDTO.getBrand());
        Assert.assertEquals(product.getPrice(), productDTO.getPrice());
    }

    @Test
    public void parseDTOToDomainTest() {
        ProductDTO productDTO = inputObject.mockDTO();
        Product product = ProductConverter.toDomain(productDTO);

        Assert.assertEquals(productDTO.getId(), product.getId());
        Assert.assertEquals(productDTO.getName(), product.getName());
        Assert.assertEquals(productDTO.getDescription(), product.getDescription());
        Assert.assertEquals(productDTO.getBrand(), product.getBrand());
        Assert.assertEquals(productDTO.getPrice(), product.getPrice());
    }

    @Test
    public void parseDomainListToDTOListTest() {
        List<Product> domains = inputObject.mockDomainList();
        List<ProductDTO> dtos = ProductConverter.toDTOList(domains);

        for (int i = 0; i < domains.size(); i++) {
            Assert.assertEquals(domains.get(i).getId(), dtos.get(i).getId());
            Assert.assertEquals(domains.get(i).getName(), dtos.get(i).getName());
            Assert.assertEquals(domains.get(i).getDescription(), dtos.get(i).getDescription());
            Assert.assertEquals(domains.get(i).getBrand(), dtos.get(i).getBrand());
            Assert.assertEquals(domains.get(i).getPrice(), dtos.get(i).getPrice());
        }
    }

    @Test
    public void parseDTOListToDomainListTest() {
        List<ProductDTO> dtos = inputObject.mockDTOList();
        List<Product> domains = ProductConverter.toDomainList(dtos);

        for (int i = 0; i < dtos.size(); i++) {
            Assert.assertEquals(dtos.get(i).getId(), domains.get(i).getId());
            Assert.assertEquals(dtos.get(i).getName(), domains.get(i).getName());
            Assert.assertEquals(dtos.get(i).getDescription(), domains.get(i).getDescription());
            Assert.assertEquals(dtos.get(i).getBrand(), domains.get(i).getBrand());
            Assert.assertEquals(dtos.get(i).getPrice(), domains.get(i).getPrice());
        }
    }
}
