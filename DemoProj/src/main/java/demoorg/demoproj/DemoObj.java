package demoorg.demoproj;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DemoObj implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer cusAge;
   private java.lang.String cusName;

   public DemoObj()
   {
   }

   public java.lang.Integer getCusAge()
   {
      return this.cusAge;
   }

   public void setCusAge(java.lang.Integer cusAge)
   {
      this.cusAge = cusAge;
   }

   public java.lang.String getCusName()
   {
      return this.cusName;
   }

   public void setCusName(java.lang.String cusName)
   {
      this.cusName = cusName;
   }

   public DemoObj(java.lang.Integer cusAge, java.lang.String cusName)
   {
      this.cusAge = cusAge;
      this.cusName = cusName;
   }

}