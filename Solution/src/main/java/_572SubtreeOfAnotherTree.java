public class _572SubtreeOfAnotherTree {
  public boolean isSubtree(TreeNode s, TreeNode t) {
    return isSameTree(s, t) ||
        s != null && isSubtree(s.left, t) ||
        s != null && isSubtree(s.right, t);
  }

  private boolean isSameTree(TreeNode s, TreeNode t) {
    if (s == null && t == null) {
      return true;
    }
    if (s == null || t == null) {
      return false;
    }
    return s.val == t.val &&
        isSameTree(s.left, t.left) &&
        isSameTree(s.right, t.right);
  }
}
