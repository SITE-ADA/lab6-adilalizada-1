package az.edu.ada.wm2.lab6.model.mapper;

import az.edu.ada.wm2.lab6.model.Category;
import az.edu.ada.wm2.lab6.model.dto.CategoryRequestDto;
import az.edu.ada.wm2.lab6.model.dto.CategoryResponseDto;

public final class CategoryMapper {

    private CategoryMapper() {
    }

    public static Category toEntity(CategoryRequestDto dto) {
        if (dto == null) {
            return null;
        }
        Category category = new Category();
        category.setName(dto.getName());
        return category;
    }

    public static CategoryResponseDto toResponseDto(Category category) {
        if (category == null) {
            return null;
        }
        CategoryResponseDto response = new CategoryResponseDto();
        response.setId(category.getId());
        response.setName(category.getName());
        return response;
    }
}
