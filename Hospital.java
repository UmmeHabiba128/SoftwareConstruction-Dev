public class Hospital {
	public static void main(String[] args) {
		
		 User u = new User();
		 u.choice();
		 
		 Patient p1 = new Patient(111, "Umme Habiba");
	     Doctor d1 = new Doctor(1, "Dr. Bilal");
	     Receptionist r1 = new Receptionist(10, "Ayesha");
	     Billing b1 = new Billing(1, p1.p_id, p1.p_name, 5000.0f);

	     r1.GiveAppointment(p1);
	     d1.CheckPatient(p1);
	     p1.PayBill();
	     r1.GenerateBill();
	    System.out.println("Bill No: " + b1.B_no + ", Patient: " 
	     + b1.p_name + ", Amount: " + b1.B_amt);

    }
}

