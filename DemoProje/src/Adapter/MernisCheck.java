package Adapter;

import Abstract.ICheckPerson;

import Entity.Gamer;
import MernnisDogrulama.LGPKPSPublicSoap;

public class MernisCheck implements ICheckPerson {

    @Override
    public boolean IfRealCheckPerson(Gamer gamer) throws Exception {
        LGPKPSPublicSoap lgpkpsPublicSoap = new LGPKPSPublicSoap();
        return lgpkpsPublicSoap.TCKimlikNoDogrula(gamer.nationalityId, gamer.firstName, gamer.lastName, gamer.dateTime);
    }
}
