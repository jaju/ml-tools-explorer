import mlx.core as mx

num_features = 100
num_examples = 1_000
num_iters = 10_000
lr = 0.01

w_star = mx.random.normal((num_features,))
X = mx.random.normal((num_examples, num_features))
eps = 1e-2 * mx.random.normal((num_examples,))
y = X @ w_star + eps

def loss_fn(w):
    return 0.5 * mx.mean(mx.square(X @ w - y))

grad_fn = mx.grad(loss_fn)


w = 1e-2 * mx.random.normal((num_features,))

for _ in range(num_iters):
    grad = grad_fn(w)
    w = w - lr * grad
    mx.eval(w)

loss = loss_fn(w)
error_norm = mx.sum(mx.square(w - w_star)).item() ** 0.5 
print(f"Loss {loss.item():.5f}, |w-w*| = {error_norm:0.5f},")
