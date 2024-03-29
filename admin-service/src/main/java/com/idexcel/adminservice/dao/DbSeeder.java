/*package com.idexcel.adminservice.dao;


//import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.idexcel.adminservice.entity.Address;
import com.idexcel.adminservice.entity.Admin;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

@Service
public class DbSeeder implements CommandLineRunner {
   
    private AdminRepository adminRepository;
    private MongoTemplate mongoTemplate;

    public DbSeeder(AdminRepository adminRepository, MongoTemplate mongoTemplate) {
        this.adminRepository = adminRepository;
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) {
        this.adminRepository.deleteAll();
        //this.mongoTemplate.dropCollection(PaymentOptions.class);

        /*
        Payment Options
        

        PaymentOptions cashPayment = new PaymentOptions(PaymentType.Cash, 10);
        this.mongoTemplate.insert(creditCardPayment);
        this.mongoTemplate.insert(payPalPayment);
        this.mongoTemplate.insert(cashPayment);
         */
        /*
        Lego Sets
         

        Admin admin = new Admin("Yagnik", 
        				new Address("Laurel Ave", "Hayward", "CA", "94541", "USA"),
        				
        				"Present", 
        				"Praveen",
        				"Abc", 
        				LocalDate.now(), LocalDate.now());
/*        LegoSet milleniumFalcon = new LegoSet(
                "Millennium Falcon",
                "Star Wars",
                LegoSetDifficulty.HARD,
                new DeliveryInfo(LocalDate.now().plusDays(1), 30, true),
                Arrays.asList(
                        new ProductReview("Dan", 7),
                        new ProductReview("Anna", 10),
                        new ProductReview("John", 8)
                ),
                creditCardPayment);

        LegoSet skyPolice = new LegoSet(
                "Sky Police Air Base",
                "City",
                LegoSetDifficulty.MEDIUM,
                new DeliveryInfo(LocalDate.now().plusDays(3), 50, true),
                Arrays.asList(
                        new ProductReview("Dan", 5),
                        new ProductReview("Andrew", 8)
                ),
                creditCardPayment);

        LegoSet mcLarenSenna = new LegoSet(
                "McLaren Senna",
                "Speed Champions",
                LegoSetDifficulty.EASY,
                new DeliveryInfo(LocalDate.now().plusDays(7), 70, false),
                Arrays.asList(
                        new ProductReview("Bogdan", 9),
                        new ProductReview("Christa", 9)
                ),
                payPalPayment);

        LegoSet mindstormsEve = new LegoSet(
                "MINDSTORMS EV3",
                "Mindstorms",
                LegoSetDifficulty.HARD,
                new DeliveryInfo(LocalDate.now().plusDays(10), 100, false),
                Arrays.asList(
                        new ProductReview("Cosmin", 10),
                        new ProductReview("Jane", 9),
                        new ProductReview("James", 10)
                ),
                cashPayment);

        Collection<Admin> admins = Arrays.asList(admin);
/*
        this.adminRepository.insert(admins);
        //this.legoSetRepository.insert(initialProducts);
    }
}
*/