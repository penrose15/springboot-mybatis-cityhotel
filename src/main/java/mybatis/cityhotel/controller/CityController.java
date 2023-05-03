package mybatis.cityhotel.controller;

import lombok.RequiredArgsConstructor;
import mybatis.cityhotel.domain.City;
import mybatis.cityhotel.dto.CityDTO;
import mybatis.cityhotel.dto.CityUpdateDTO;
import mybatis.cityhotel.service.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/{id}")
    public City findById(@PathVariable Long id) {
        return cityService.getCityById(id);
    }

    @PostMapping
    public void insertCity(@RequestBody CityDTO cityDTO) {
        cityService.insertCity(cityDTO.getName());
    }

    @PutMapping("/{id}")
    public void updateCity(@RequestBody CityUpdateDTO dto) {
        cityService.updateCity(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Long id) {
        cityService.deleteCity(id);
    }
}
