package atomic1028.gl.emeraldknight.kernel;

public class abstract_choice {
    String target;

    public abstract_choice() {
        target = Constant.GAME_OVER;
    }

    public abstract_choice(String tar) {
        target = tar;
    }

    public String text() {
        return Constant.scene_name.get(target);
    }

    public boolean show() {
        return true;
    }

    public void chosen() {
        Constant.kernel.setScene(target);
    }
}

class choice_end extends abstract_choice {
    String end;

    public choice_end(String m) {
        super(Constant.GAME_OVER);
        end = m;
    }

    @Override
    public String text() {
        return "回到开始界面";
    }

    @Override
    public void chosen() {
        Constant.kernel.openPara(end);
        super.chosen();
    }
}