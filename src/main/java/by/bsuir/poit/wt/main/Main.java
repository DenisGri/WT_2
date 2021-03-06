package by.bsuir.poit.wt.main;

import by.bsuir.poit.wt.entity.Appliance;
import by.bsuir.poit.wt.entity.criteria.Criteria;
import by.bsuir.poit.wt.entity.criteria.SearchCriteria.*;
import by.bsuir.poit.wt.service.ApplianceService;
import by.bsuir.poit.wt.service.ServiceFactory;

public class Main {

    public static void main (String[] args) {

        ServiceFactory factory = ServiceFactory.getInstance ();
        ApplianceService service = factory.getApplianceService ();

        Criteria criteriaOven = new Criteria (Oven.class.getSimpleName ());//"Oven"
        criteriaOven.add (Oven.CAPACITY.toString (), 3);

        Appliance appliance = service.find (criteriaOven);

        PrintApplianceInfo.print (appliance);

        criteriaOven = new Criteria (Oven.class.getSimpleName ());
        criteriaOven.add (Oven.HEIGHT.toString (), 200);
        criteriaOven.add (Oven.DEPTH.toString (), 300);

        appliance = service.find (criteriaOven);

        PrintApplianceInfo.print (appliance);

        Criteria criteriaTabletPC = new Criteria (TabletPC.class.getSimpleName ());
        criteriaTabletPC.add (TabletPC.COLOR.toString (), "BLUE");
        criteriaTabletPC.add (TabletPC.DISPLAY_INCHES.toString (), 14);
        criteriaTabletPC.add (TabletPC.MEMORY_ROM.toString (), 4);

        appliance = service.find (criteriaOven);

        PrintApplianceInfo.print (appliance);

    }

}
