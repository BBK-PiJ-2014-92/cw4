package sourcecode;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;

import interfaces.Contact;
import interfaces.Meeting;

public class MeetingImpl implements Meeting {
	private int id;
	private Calendar date;
	private Set<Contact> contacts;
	public static int count = 0;
	
	public MeetingImpl(GregorianCalendar date, Set<Contact> contacts) {
		count++;
		this.date = date;
		this.contacts = contacts;
		this.id = count;
	}
	public int getId() {
		return id;
	}
	public Calendar getDate() {
		// TODO Auto-generated method stub
		return null;
	}
	public Set<Contact> getContacts() {
		// TODO Auto-generated method stub
		return null;
	}

}