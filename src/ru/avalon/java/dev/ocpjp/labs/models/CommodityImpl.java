package ru.avalon.java.dev.ocpjp.labs.models;

class CommodityImpl implements Commodity, Cloneable{

   
    String code;
    String vendorCode;
    String name;
    double price;
    int residue;
    
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getVendorCode() {
        return vendorCode;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getResidue() {
        return residue;
    }
    
    static class CommodityBuilderImpl implements CommodityBuilder{
        
        private CommodityImpl dummy = new CommodityImpl(); 
        
        protected CommodityBuilderImpl(){};

        @Override
        public CommodityBuilder code(String code) {
            dummy.code = code;
            return this;
        }

        @Override
        public CommodityBuilder vendorCode(String vendorCode) {
            dummy.vendorCode = vendorCode;
            return this;
        }

        @Override
        public CommodityBuilder name(String name) {
            dummy.name = name;
            return this;
        }

        @Override
        public CommodityBuilder price(double price) {
            dummy.price = price;
            return this;
        }

        @Override
        public CommodityBuilder residue(int residue) {
            dummy.residue = residue;
            return this;
        }

        @Override
        public Commodity build() {
            Commodity result = dummy;
            dummy = new CommodityImpl();
            return result;
        }
    }
}
