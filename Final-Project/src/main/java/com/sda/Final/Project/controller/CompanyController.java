package com.sda.Final.Project.controller;

import com.sda.Final.Project.dto.ClientDTO;
import com.sda.Final.Project.dto.CompanyDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sda.Final.Project.service.IServiceImpl.iCompanyService;
import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private iCompanyService iCompanyService;

    @PostMapping
    public  void save(@RequestBody @Valid CompanyDTO companyDTO){
        iCompanyService.save(companyDTO);
    }

    @PutMapping
    void update(@RequestBody @Valid CompanyDTO companyDTO){
        iCompanyService.update(companyDTO);
    }

    @GetMapping("/{id}")
    public CompanyDTO findById(@PathVariable("id") Integer id){
        return iCompanyService.findById(id);
    }

    @GetMapping
    public List<CompanyDTO> findAll(){
        return iCompanyService.findAll();
    }

    @GetMapping("/clients/{companyId}")
    public List<ClientDTO> findAllClientsOfCompany( @PathVariable("companyId") Integer companyId) {
        return iCompanyService.findAllClientsOfCompany(companyId);
    }


    @DeleteMapping("/{id}")
    public void delete (@PathVariable Integer id){
        iCompanyService.delete(id);
    }
}
