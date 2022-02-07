package com.hcl.hw;

import java.util.ArrayList;
import java.util.Collections;

class Main {
	public static void main(String[] args) {
		ArrayList<PracticeComparable> list = new ArrayList<PracticeComparable>();
		list.add(new PracticeComparable("Ram", "Krishna", "Physician", 1, 11,
				20));
		list.add(new PracticeComparable("Kiran", "Ravi", "Cardiologist", 2, 15,
				35));
		list.add(new PracticeComparable("Kim", "Paul", "Dentist", 5, 17, 60));
		list.add(new PracticeComparable("Tom", "John", "Surgeon", 7, 18, 29));

		System.out.println("\nSorted by patient's Age");
		PatientAgeCompare patientAgeCompare = new PatientAgeCompare();
		Collections.sort(list, patientAgeCompare);
		for (PracticeComparable age : list)
			System.out.println("Patient's Age:" + age.getpatientAge() + " " + "Name:" + age.getpatientName()
					+ " " +"ID:" + age.getpatientID());

		System.out.println("\nSorted by patientID");
		PatientIDCompare patientIDCompare = new PatientIDCompare();
		Collections.sort(list, patientIDCompare);
		for (PracticeComparable idp : list)
			System.out.println("Patient's ID:" + idp.getpatientID() + " " + "Name:" + idp.getpatientName()
					+ " " + "Age:" + idp.getpatientAge());

		// Uses Comparable to sort by patient's name
		System.out.println("\nSorted by patient's name");
		PatientNameCompare patientNameCompare = new PatientNameCompare();
		Collections.sort(list, patientNameCompare);
		for (PracticeComparable name : list)
			System.out.println("Patient's name:" + name.getpatientName() + " "+"Age:" + " "
					+ name.getpatientAge() + " " +"ID: " + name.getpatientID());

		System.out.println("\nSorted by doctor's ID");
		DoctorIDCompare doctorIDCompare = new DoctorIDCompare();
		Collections.sort(list, doctorIDCompare);
		for (PracticeComparable iddr : list)
			System.out.println("Doctor's ID:"+ iddr.getdoctorID() + " " +"Name:"+ iddr.getdoctorName()
					+ " " +"Specialty: "+ iddr.getdoctorSpecialty());

		// Uses Comparable to sort by doctor's name
		System.out.println("\nSorted by doctor's name");
		DoctorNameCompare doctorNameCompare = new DoctorNameCompare();
		Collections.sort(list, doctorNameCompare);
		for (PracticeComparable dnm : list)
			System.out.println("Doctor's name:"+ dnm.getdoctorName() + " "+"Specialty:"
					+ dnm.getdoctorSpecialty() + " " +"ID:"+ dnm.getdoctorID());

		// Uses Comparable to sort by doctor's specialty

		System.out.println("\nSorted by doctor's specialty");
		DoctorSpecialtyCompare doctorSpecialtyCompare = new DoctorSpecialtyCompare();
		Collections.sort(list, doctorSpecialtyCompare);
		for (PracticeComparable dsp : list)
			System.out.println("Doctor's specialty:"+ dsp.getdoctorSpecialty() + " "
					+ "ID:"+ dsp.getdoctorID() + " " + "Name:"+ dsp.getdoctorName());

	}

}
