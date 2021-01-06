package com.xworkz.xworkzapp.disneyland;

public class DisneyLand {

		private String characterName;
		private int characterId;
		
		public String getCharacterName() {
			return characterName;
		}

		public void setCharacterName(String characterName) {
			this.characterName = characterName;
		}

		public int getCharacterid() {
			return characterId;
		}

		public void setCharacterid(int characterid) {
			characterId = characterid;
		}
		public DisneyLand() {
			
		}

				@Override
		public String toString() {
			return "DisneyLand [characterName=" + characterName + "]";
		}
		
		
		@Override
		public int hashCode() {
			return (int)characterId;
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
			else if(this.characterName.equals(obj)) {
				return true;
			}
			
			return false;
		}
		
	}


