class User {
    void choice() {
        System.out.println("Choose your Role: Doctor, Patient or Receptionist");
    }
} 

 class Patient extends User {
        int p_id;
        String p_name;

  Patient(int id, String name) {
            this.p_id = id;
            this.p_name = name;
        }
void PayBill() {
            System.out.println(p_id + ", Name: " + p_name + " is paying the bill.");
        }
    }

 class Doctor extends User {
        int d_id;
        String d_name;

 Doctor(int id, String name) {
            this.d_id = id;
            this.d_name = name;
        }
 void CheckPatient(Patient p) {
            System.out.println( d_name + " is checking patient " + p.p_name);
        }
    }

 class Receptionist extends User {
        int r_id;
        String r_name;

  Receptionist(int id, String name) {
            this.r_id = id;
            this.r_name = name;
        }

   void GiveAppointment(Patient p) {
            System.out.println(r_name + " gave appointment to " + p.p_name);
        }

   void GenerateBill() {
            System.out.println("The bill is generating...");
        }
    }

class Billing {
        int B_no;
        int p_id;
        String p_name;
        float B_amt;

  Billing(int no, int id, String name, float amt) {
            this.B_no = no;
            this.p_id = id;
            this.p_name = name;
            this.B_amt = amt;
        }
    }

