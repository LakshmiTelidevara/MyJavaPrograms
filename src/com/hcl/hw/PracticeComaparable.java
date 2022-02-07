package com.hcl.hw;

import java.io.*;
import java.util.*;

//A class 'PracticeComparable' that implements Comparable
class PracticeComparable implements Comparable<PracticeComparable> {
	private int patientID;
	private int doctorID;
	private int patientAge;
	private String patientName;
	private String doctorName;
	private String doctorSpecialty;

	// Used to sort PracticeComparables by patient's age
	public int compareTo(PracticeComparable m) {
		return this.patientAge - m.patientAge;
	}

	// Constructor
	public PracticeComparable(String pnm, String dnm, String ds, int pid,
			int drid, int pa) {
		this.patientName = pnm;
		this.doctorName = dnm;
		this.doctorSpecialty = ds;
		this.patientID = pid;
		this.doctorID = drid;
		this.patientAge = pa;

	}

	// Getter methods for accessing private data
	public String getpatientName() {
		return patientName;
	}

	public String getdoctorName() {
		return doctorName;
	}

	public String getdoctorSpecialty() {
		return doctorSpecialty;
	}

	public int getpatientID() {
		return patientID;
	}

	public int getdoctorID() {
		return doctorID;
	}

	public int getpatientAge() {
		return patientAge;
	}

}

// Class to compare PracticeComparables by patient's age
class PatientAgeCompare implements Comparator<PracticeComparable> {
	public int compare(PracticeComparable m1, PracticeComparable m2) {
		if (m1.getpatientAge() < m2.getpatientAge())
			return -1;
		if (m1.getpatientAge() > m2.getpatientAge())
			return 1;
		else
			return 0;
	}
}

// Class to compare PracticeComparables by patient's ID
class PatientIDCompare implements Comparator<PracticeComparable> {
	public int compare(PracticeComparable m3, PracticeComparable m4) {
		if (m3.getpatientID() < m4.getpatientID())
			return -1;
		if (m3.getpatientID() > m4.getpatientID())
			return 1;
		else
			return 0;
	}
}

// Class to compare PracticeComparables by doctor's ID
class DoctorIDCompare implements Comparator<PracticeComparable> {
	public int compare(PracticeComparable m5, PracticeComparable m6) {
		if (m5.getdoctorID() < m6.getdoctorID())
			return -1;
		if (m5.getdoctorID() > m6.getdoctorID())
			return 1;
		else
			return 0;
	}
}

// Class to compare PracticeComparables by patient's name
class PatientNameCompare implements Comparator<PracticeComparable> {
	public int compare(PracticeComparable m7, PracticeComparable m8) {
		return m7.getpatientName().compareTo(m8.getpatientName());
	}
}

// Class to compare PracticeComparables by doctor's name
class DoctorNameCompare implements Comparator<PracticeComparable> {
	public int compare(PracticeComparable m9, PracticeComparable m10) {
		return m9.getdoctorName().compareTo(m10.getdoctorName());
	}
}

// Class to compare PracticeComparables by doctor's specialty
class DoctorSpecialtyCompare implements Comparator<PracticeComparable> {
	public int compare(PracticeComparable m11, PracticeComparable m12) {
		return m11.getdoctorSpecialty().compareTo(m12.getdoctorSpecialty());
	}

}
