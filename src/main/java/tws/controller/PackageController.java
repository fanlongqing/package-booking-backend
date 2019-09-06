package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Package;
import tws.service.PackageService;

import java.net.URI;

@RestController
@RequestMapping("/packages")
@CrossOrigin("*")
public class PackageController {
    @Autowired
    PackageService packageService;
    @PostMapping("")
    public ResponseEntity<Package> addPackage(@RequestBody Package packages ){
        packageService.addPackages(packages);
        return ResponseEntity.created(URI.create("/packages/"+packages.getTrackingNumber())).build();
    }
}
