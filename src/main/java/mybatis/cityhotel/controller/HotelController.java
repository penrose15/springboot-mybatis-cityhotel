package mybatis.cityhotel.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mybatis.cityhotel.domain.Hotel;
import mybatis.cityhotel.dto.HotelDTO;
import mybatis.cityhotel.service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
@RequiredArgsConstructor
public class HotelController {
    private final HotelService hotelService;

    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/city/{cityId}")
    public List<Hotel> getAllHotelsByCityId(@PathVariable(value = "cityId") Long cityId) {
        return hotelService.getAllHotelsByCityId(cityId);
    }

    @GetMapping("/{id}")
    public Hotel getHotelById(@PathVariable Long id) {
        return hotelService.getHotelById(id);
    }

    @PostMapping
    public void insertHotel(@RequestBody HotelDTO dto) {
        hotelService.insertHotel(dto);
    }

    @PutMapping("/{id}")
    public void updateHotel(@PathVariable Long id,
                            @RequestBody HotelDTO dto) {
        hotelService.updateHotel(id, dto.getHotel());
    }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable Long id) {
        hotelService.deleteHotel(id);
    }
}
