package Mapper;

import domain.Brand;

import java.util.List;

public interface BrandMapper {
    public List<Brand> selectAll();
    public Brand selectById(int id);

}
