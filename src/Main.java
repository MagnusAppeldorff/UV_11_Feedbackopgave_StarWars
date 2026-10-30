void main() {

    allCharacters();

}

private static void allCharacters() {
    List<Character> characters = new ArrayList<>();

    characters.add(new Jedi("Luke Skywalker", 23));
    characters.add(new Sith("Darth Vader", 45));
    characters.add(new Droid("R2-D2", 30));
    characters.add(new CloneTrooper("Rex", 12));

    for (Character character : characters) {
        character.goLive();
        character.action();

        if (character instanceof Jedi) {
            ((Jedi) character).useMeditate();
        }

        if (character instanceof ForceUser) {
            ((ForceUser) character).useForce();
        }
    }
}