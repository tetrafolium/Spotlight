package com.takusemba.spotlight;

import android.animation.Animator;

/**
 * default implementation of {@link Animator.AnimatorListener}
 */
public class AbstractAnimatorListener implements Animator.AnimatorListener {

  @Override
  public void onAnimationStart(final Animator animation) {}

  @Override
  public void onAnimationEnd(final Animator animation) {}

  @Override
  public void onAnimationCancel(final Animator animation) {}

  @Override
  public void onAnimationRepeat(final Animator animation) {}
}
