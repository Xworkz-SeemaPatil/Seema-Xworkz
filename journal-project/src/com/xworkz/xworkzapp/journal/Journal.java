package com.xworkz.xworkzapp.journal;

public class Journal {
	private String topicName;
	private int journalId;
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public int getJournalId() {
		return journalId;
	}
	public void setJournalId(int journalId) {
		this.journalId = journalId;
	}
	
	@Override
	public String toString() {
		return "Journal [topicName=" + topicName + "]";
	}
	
	
	@Override
	public int hashCode() {
		return (int)journalId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null)
		{
			if(this == obj) {
				return true;
			}
		 }
		if(obj == null)
		{
			System.out.println("object is null");
		}
		else if(this.hashCode() == obj.hashCode()) {
			return true;
		}
		else if(this.topicName.equals(obj)) {
			return true;
		}
		
		return false;

	}



}
